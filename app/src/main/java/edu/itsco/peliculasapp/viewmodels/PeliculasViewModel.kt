package edu.itsco.peliculasapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import edu.itsco.peliculasapp.database.Pelicula
import edu.itsco.peliculasapp.repositorios.PeliculasRepository
import kotlinx.coroutines.launch

class PeliculasViewModel(private val repository: PeliculasRepository): ViewModel() {

    val allPeliculas: LiveData<List<Pelicula>> = repository.allPeliculas.asLiveData()

    fun insert(pelicula: Pelicula) = viewModelScope.launch {
        repository.insert(pelicula)
    }
}