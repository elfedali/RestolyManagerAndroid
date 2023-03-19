package ma.weboven.restoly_manager

import ma.weboven.restoly_manager.screens.RegistrationData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("register")
    suspend fun registerUser(@Body registrationData: RegistrationData): Response<Unit>
}