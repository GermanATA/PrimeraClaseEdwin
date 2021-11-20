package german.primeraclaseedwin


import com.google.gson.annotations.SerializedName

data class SuperHeroeItem(
    @SerializedName("alias") //como se llama el dato en json
    val alias: String,            //Como se llama el dato en mi aplicacion
    @SerializedName("city")
    val ciudad: String,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("name")
    val nombre: String,
    @SerializedName("occupation")
    val ocupacion: String,
    @SerializedName("powers")
    val poderes: String,
    @SerializedName("urlPicture")
    val urlPicture: String
)