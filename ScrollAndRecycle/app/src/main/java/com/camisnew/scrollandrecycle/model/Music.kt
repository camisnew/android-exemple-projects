package com.camisnew.scrollandrecycle.model

class Music (var title: String, var artist: String, var album: String ) {

    override fun toString(): String {
        return "Title: ${this.title}\nArtist: ${this.artist}\nAlbum: ${this.album}"
    }

}