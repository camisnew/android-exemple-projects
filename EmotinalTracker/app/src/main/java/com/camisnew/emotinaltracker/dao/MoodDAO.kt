package com.camisnew.emotinaltracker.dao

import androidx.room.*
import com.camisnew.emotinaltracker.model.Mood

@Dao
interface MoodDAO {

    @Query("Select * from mood limit 30")
    fun fetch(): List<Mood>

    @Insert
    fun store(vararg mood: Mood)

    @Delete
    fun delete(mood: Mood)

    @Update
    fun update(mood: Mood)
}