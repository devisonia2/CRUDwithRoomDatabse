package com.sonia.crudwithroomdatabse

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities  =[Facts::class], version = 1, exportSchema =true)
abstract class ToDoDatabase:RoomDatabase() {
    abstract fun todointerface(): ToDoInterface

    //static members and functions of the class
    companion object {
        private var toDoDatabase: ToDoDatabase? = null

        fun getInstance(context: Context): ToDoDatabase {
            if (toDoDatabase == null) {
                toDoDatabase = Room.databaseBuilder(
                    context,
                    ToDoDatabase::class.java,
                    "TodoDatabase")
                    .allowMainThreadQueries()
                    .build()
            }
            return toDoDatabase!!
        }
    }
}