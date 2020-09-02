package com.camisnew.emotinaltracker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.camisnew.emotinaltracker.R
import com.camisnew.emotinaltracker.dao.AppDatabase
import com.camisnew.emotinaltracker.model.Mood
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

/**
 * A simple [Fragment] subclass.
 * Use the [MoodAnalysis.newInstance] factory method to
 * create an instance of this fragment.
 */
class MoodAnalysis() : Fragment() {
    private lateinit var graph : GraphView

    private lateinit var moods: ArrayList<Mood>
    private lateinit var moodEntries: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        moodEntries = AppDatabase.openDatabase(activity!!.applicationContext)!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mood_analysis, container, false)
        graph = view.findViewById(R.id.analysisGraph)
        moods = moodEntries.moodDAO().fetch() as ArrayList<Mood>

        val series = LineGraphSeries<DataPoint>()
        moods.map{mood -> DataPoint(mood.id!!.toDouble(), mood.feeling.toDouble())}
            .forEach { series.appendData(it, true, 10) }
        graph.addSeries(series)

        return view
    }
}
