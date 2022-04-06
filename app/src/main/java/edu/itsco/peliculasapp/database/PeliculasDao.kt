package edu.itsco.peliculasapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PeliculasDao {
    @Query("SELECT * FROM peliculas")
    fun getAllPeliculas(): Flow<List<Pelicula>>

    @Insert
    suspend fun insert(pelicula: Pelicula)
}