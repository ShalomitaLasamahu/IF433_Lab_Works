package oop_125861_shalomitaaclasamahu.week07

enum class AppStates {
    STARTTING, RUNNING, STOPPED
 }

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Failure(val error: String) : ApiResponse()
    object Loading : ApiResponse()
 }