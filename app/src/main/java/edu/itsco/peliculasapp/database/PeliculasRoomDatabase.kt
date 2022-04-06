package edu.itsco.peliculasapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Pelicula::class), version = 1, exportSchema = false)
abstract class PeliculasRoomDatabase: RoomDatabase() {

    abstract fun peliculasDao(): PeliculasDao

    companion object{

        //Es el que utilizaremos para devolver la única instancia del tipo Database
        private var INSTANCE: PeliculasRoomDatabase? = null

        fun getInstance(context: Context): PeliculasRoomDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PeliculasRoomDatabase::class.java,
                    "peliculas_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}