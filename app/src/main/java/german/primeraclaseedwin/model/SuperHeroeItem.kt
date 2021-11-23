package german.primeraclaseedwin.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SuperHeroeItem(
    @SerializedName("alias")//nombre que viene de json
    val alias: String, //nombre en mi aplicacion
    @SerializedName("city")
    val city: String,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("occupation")
    val occupation: String,
    @SerializedName("powers")
    val powers: String,
    @SerializedName("size")
    val size: Double,
    @SerializedName("urlPicture")
    val urlPicture: String
) : Serializable