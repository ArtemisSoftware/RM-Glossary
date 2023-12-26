package com.artemissoftware.rmglossary.data.remote.service

sealed class Endpoints(val url: String) {

    data class GetCharacter(private val id: Int) : Endpoints("character/$id")
}
