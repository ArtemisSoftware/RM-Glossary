package com.artemissoftware.rmglossary.data.mappers

import com.artemissoftware.rmglossary.data.remote.dto.CharacterDto
import com.artemissoftware.rmglossary.data.remote.dto.LocationDto
import com.artemissoftware.rmglossary.data.remote.dto.OriginDto
import com.artemissoftware.rmglossary.domain.models.Character
import com.artemissoftware.rmglossary.domain.models.Gender
import com.artemissoftware.rmglossary.domain.models.Location
import com.artemissoftware.rmglossary.domain.models.Origin
import com.artemissoftware.rmglossary.domain.models.Status

internal fun String.toGender() = when (lowercase()) {
    "female" -> Gender.Female
    "male" -> Gender.Male
    "genderless" -> Gender.Genderless
    else -> Gender.Unknown
}

internal fun String.toStatus() = when (lowercase()) {
    "alive" -> Status.Alive
    "dead" -> Status.Dead
    else -> Status.Unknown
}

internal fun LocationDto.toLocation(): Location {
    return Location(name = name, url = url)
}

internal fun OriginDto.toOrigin(): Origin {
    return Origin(name = name, url = url)
}

fun CharacterDto.toCharacter(): Character {
    return Character(
        created = created,
        episodeIds = episode.map { it.substring(it.lastIndexOf("/") + 1).toInt() },
        gender = gender.toGender(),
        id = id,
        imageUrl = image,
        location = location.toLocation(),
        name = name,
        origin = origin.toOrigin(),
        species = species,
        status = status.toStatus(),
        type = type,
    )
}
