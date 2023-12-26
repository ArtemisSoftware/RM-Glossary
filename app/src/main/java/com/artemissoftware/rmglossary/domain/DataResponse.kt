package com.artemissoftware.rmglossary.domain

sealed interface DataResponse<T> {
    data class Success<T>(val data: T) : DataResponse<T>
    data class Failure<T>(val exception: Exception) : DataResponse<T>
}
