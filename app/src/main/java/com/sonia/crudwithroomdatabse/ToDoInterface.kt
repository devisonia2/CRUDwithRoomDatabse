package com.sonia.crudwithroomdatabse

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ToDoInterface {
    @Insert
    fun insertToDo(todoEntity: Facts)

    @Query("SELECT * FROM Facts")
    fun getlist() : List<Facts>

    @Update
    fun updateToDoEntity(todoEntity: Facts)

    @Delete
    fun deleteToDoEntity(todoEntity: Facts)
}