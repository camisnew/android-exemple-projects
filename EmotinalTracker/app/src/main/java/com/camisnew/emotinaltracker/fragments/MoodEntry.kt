package com.camisnew.emotinaltracker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.camisnew.emotinaltracker.R
import com.camisnew.emotinaltracker.dao.AppDatabase
import com.camisnew.emotinaltracker.model.Mood

class MoodEntry : Fragment() {
    private lateinit var emotion : Spinner
    private lateinit var description : TextView
    private lateinit var register : Button

    private lateinit var moodDatabase : AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moodDatabase = AppDatabase.openDatabase(activity!!.applicationContext)!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mood_entry, container, false)
        emotion = view.findViewById(R.id.moodField1)
        description = view.findViewById(R.id.moodField2)
        register = view.findViewById(R.id.registerButton)

        register.setOnClickListener {
            var newMood = Mood(null, emotion.selectedItemPosition, description.toString() )
            moodDatabase.moodDAO().store(newMood)
        }

        return view
    }
}