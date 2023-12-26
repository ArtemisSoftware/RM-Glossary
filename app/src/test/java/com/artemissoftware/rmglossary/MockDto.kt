package com.artemissoftware.rmglossary

import com.artemissoftware.rmglossary.data.remote.dto.CharacterDto
import com.artemissoftware.rmglossary.data.remote.dto.LocationDto
import com.artemissoftware.rmglossary.data.remote.dto.OriginDto

object MockDto {

    val originDto = OriginDto(
        name = "Earth (C-137)",
        url = "https://rickandmortyapi.com/api/location/1",
    )

    val locationDto = LocationDto(
        name = "Citadel of Ricks",
        url = "https://rickandmortyapi.com/api/location/3",
    )

    val characterDto = CharacterDto(
        id = 1,
        name = "Rick Sanchez",
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Male",
        origin = originDto,
        location = locationDto,
        url = "https://rickandmortyapi.com/api/character/1",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2", "https://rickandmortyapi.com/api/episode/3"),
        created = "2017-11-04T18:48:46.250Z",
    )
}
