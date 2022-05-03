package edu.itsco.peliculasapp.repositorios

import androidx.annotation.WorkerThread
import edu.itsco.peliculasapp.database.Pelicula
import edu.itsco.peliculasapp.database.PeliculasDao
import kotlinx.coroutines.flow.Flow

class PeliculasRepository(private val peliculasDao: PeliculasDao ) {

    val allPeliculas: Flow<List<Pelicula>>
        = peliculasDao.getAllPeliculas()

    @WorkerThread
    suspend fun insert(pelicula: Pelicula){
        peliculasDao.insert(pelicula)
    }
}