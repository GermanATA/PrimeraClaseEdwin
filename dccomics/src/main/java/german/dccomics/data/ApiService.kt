package german.dccomics.data

import german.dccomics.model.SuperHeroe
import retrofit2.http.GET

interface ApiService {
    @GET("GermanATA/PrimeraClaseEdwin/superheroes")
    suspend fun getSuperheroes(): SuperHeroe
}