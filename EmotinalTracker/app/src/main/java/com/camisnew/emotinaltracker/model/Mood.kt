package com.camisnew.emotinaltracker.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class Mood (
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var feeling: Int,
    var description: String) : Serializable {

    override fun toString(): String {
        return super.toString()
    }
}