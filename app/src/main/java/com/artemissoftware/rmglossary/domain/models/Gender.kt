package com.artemissoftware.rmglossary.domain.models

sealed class Gender(val displayName: String) {
    object Male : Gender("Male")
    object Female : Gender("Female")
    object Genderless : Gender("No gender")
    object Unknown : Gender("Not specified")
}
