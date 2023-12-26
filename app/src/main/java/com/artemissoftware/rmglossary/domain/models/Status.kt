package com.artemissoftware.rmglossary.domain.models

sealed class Status(val displayName: String) {
    object Alive : Status("Alive")
    object Dead : Status("Dead")
    object Unknown : Status("Unknown")
}
