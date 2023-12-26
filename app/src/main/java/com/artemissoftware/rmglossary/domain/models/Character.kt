package com.artemissoftware.rmglossary.domain.models

data class Character(
    val created: String,
    val episodeIds: List<Int>,
    val gender: Gender,
    val id: Int,
    val imageUrl: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: Status,
    val type: String,
)
