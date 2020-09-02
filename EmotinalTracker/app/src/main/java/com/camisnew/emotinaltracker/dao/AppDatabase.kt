package com.camisnew.emotinaltracker.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.camisnew.emotinaltracker.model.Mood

@Database(entities = arrayOf(Mood::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun moodDAO() : MoodDAO

    companion object {
        var INSTANCE: AppDatabase? = null

        fun openDatabase(context: Context): AppDatabase? {
                    if(INSTANCE == null) {
                        synchronized(AppDatabase::class) {
                            INSTANCE = Room.databaseBuilder(
                                context,
                                AppDatabase::class.java,
                            "mood.db")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return INSTANCE
        }

        fun closeDatabase() {
                INSTANCE = null
        }
    }

}