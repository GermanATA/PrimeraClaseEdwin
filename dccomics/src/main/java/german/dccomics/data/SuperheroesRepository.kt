package german.dccomics.data

class SuperheroesRepository {
    suspend fun getSuperheroes()=ApiFactory.retrofit.getSuperheroes()
}