package com.sonia.crudwithroomdatabse

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Facts (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String? = "",
    var description: String? = ""
){
    override fun toString(): String {
        return "$title\n $description"
    }
}