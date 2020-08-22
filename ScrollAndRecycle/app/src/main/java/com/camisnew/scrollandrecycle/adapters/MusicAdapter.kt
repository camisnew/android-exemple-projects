package com.camisnew.scrollandrecycle.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.camisnew.scrollandrecycle.R
import com.camisnew.scrollandrecycle.model.Music
import kotlinx.android.synthetic.main.item_music.view.*

class MusicAdapter(val musics: List<Music>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_music, parent, false))
    }

    override fun getItemCount(): Int {
        return this.musics.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val thisMusic = this.musics[position]

        if(holder is ViewHolder) {
            holder.bind(thisMusic, position, context)
        }
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind (music: Music?, position: Int, context: Context) {
        val thisTitle = itemView.textMusicTitle
        val thisArtist = itemView.textMusicArtist
        val thisAlbum = itemView.textMusicAlbum
        var cardPosition = itemView.musicItemCard

        music?.let {
            thisTitle.text = it.title
            thisArtist.text = it.artist
            thisAlbum.text = it.album
        }
    }
}