package com.camisnew.scrollandrecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.camisnew.scrollandrecycle.adapters.MusicAdapter
import com.camisnew.scrollandrecycle.model.Music
import kotlinx.android.synthetic.main.activity_recycle_layout.*

class RecycleViewEx : AppCompatActivity() {

    private lateinit var adapter: MusicAdapter
    val playlist = arrayListOf<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_layout)

        initializer()


        playlist.add(Music("The Day That Never Comes", "Metallica", "Death Magnetic"))
        playlist.add(Music("Beast and the Harlot", "Avenged Sevenfold", "City of Evil"))
        playlist.add(Music("Máscara", "Pitty", "Admirável Chip Novo"))
        playlist.add(Music("Follow the Hollow", "Soilwork", "Figure N5"))

        adapter.notifyDataSetChanged()
    }

    private fun initializer() {
        adapter = MusicAdapter(playlist, this@RecycleViewEx)
        recycleViewBox.adapter = adapter

        recycleViewBox.layoutManager = LinearLayoutManager(this@RecycleViewEx)
//        recycleViewBox.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}