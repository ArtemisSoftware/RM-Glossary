package com.artemissoftware.rmglossary

import com.artemissoftware.rmglossary.data.remote.dto.OriginDto
import com.artemissoftware.rmglossary.domain.models.Character
import com.artemissoftware.rmglossary.domain.models.Gender
import com.artemissoftware.rmglossary.domain.models.Location
import com.artemissoftware.rmglossary.domain.models.Origin
import com.artemissoftware.rmglossary.domain.models.Status

object MockDomainModels {

    val location = Location(
        name = "Citadel of Ricks",
        url = "https://rickandmortyapi.com/api/location/3",
    )

    val origin = Origin(
        name = "Earth (C-137)",
        url = "https://rickandmortyapi.com/api/location/1",
    )

    val character = Character(
        id = 1,
        name = "Rick Sanchez",
        status = Status.Alive,
        species = "Human",
        type = "",
        gender = Gender.Male,
        origin = origin,
        location = location,
        imageUrl = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        episodeIds = listOf(1, 2, 3),
        created = "2017-11-04T18:48:46.250Z",
    )
}