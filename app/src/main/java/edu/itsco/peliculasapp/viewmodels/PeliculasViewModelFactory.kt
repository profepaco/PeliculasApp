package edu.itsco.peliculasapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.itsco.peliculasapp.repositorios.PeliculasRepository
import java.lang.IllegalArgumentException

class PeliculasViewModelFactory(private val repository: PeliculasRepository):
ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PeliculasViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return PeliculasViewModel(repository) as T
        }
        throw IllegalArgumentException("ViewModel desconocido")
    }
}