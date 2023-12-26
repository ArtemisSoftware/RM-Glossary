package com.artemissoftware.rmglossary.data.remote

import com.artemissoftware.rmglossary.domain.DataResponse

object HandleApi {

    inline fun <T> safeApiCall(apiCall: () -> T): DataResponse<T> {
        return try {
            DataResponse.Success(data = apiCall())
        } catch (e: Exception) {
            DataResponse.Failure(exception = e)
        }
    }
}
