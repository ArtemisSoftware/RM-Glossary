package com.artemissoftware.rmglossary.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class OriginDto(
    val name: String,
    val url: String,
)
