package com.artemissoftware.rmglossary.data.remote.service

sealed class Endpoints(val url: String) {

    data class GetCharacter(private val id: Int) : Endpoints("character/$id")
    data class GetEpisodes(private val idsCommaSeparated: String) : Endpoints("episode/$idsCommaSeparated")
    data class GetEpisode(private val episodeId: String) : Endpoints("episode/$episodeId")

}
