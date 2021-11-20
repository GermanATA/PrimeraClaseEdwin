package german.primeraclaseedwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class ListSuperHeroesActivity : AppCompatActivity() {

    private lateinit var listaSuperheroes: ArrayList<SuperHeroeItem> //lateinit lo voy a inicializar despues
    private lateinit var superheroesAdapter: SuperHeroesAdapter
    private lateinit var superheroesRecyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_super_heroes)

        superheroesRecyclerview = findViewById(R.id.superheroes_recycler_view) //"Bindeo" Cuando yo cojo un recurso y lo busco por id para hacer la coneccion

        //listaSuperheroes = createMockSuperHeroes()

        listaSuperheroes=loadMockSuperHeroesFromJson()

        superheroesAdapter = SuperHeroesAdapter(listaSuperheroes)

        superheroesRecyclerview.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = superheroesAdapter
            setHasFixedSize(false)
        }
    }

    private fun loadMockSuperHeroesFromJson(): ArrayList<SuperHeroeItem> {

        val superheroesString: String = applicationContext.assets.open("superheroes.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val data = gson.fromJson(superheroesString, SuperHeroe::class.java)
        return data

    }

    /*private fun createMockSuperHeroes() : ArrayList<SuperHeroe>{
        return arrayListOf(
            SuperHeroe(
                nombre = "Superman",
                poderes= "Super strength, flight, invulnerability, super speed, heat vision, freeze breath, x-ray vision, superhuman hearing, healing factor",
                alias = "Clark Kent, Kal-El",
                ciudad = "Metropolis",
                facebook = "https://www.facebook.com/superman",
                ocupacion = "Reporter",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Superman_20190116_5c3fc2758f6a12.25513240.jpg"
            ),
            SuperHeroe(
                nombre = "Batman",
                poderes= "Exceptional martial artist, combat strategy, inexhaustible wealth, brilliant deductive skill, advanced technology",
                alias = "Bruce Wayne",
                ciudad = "Gotham",
                facebook = "https://www.facebook.com/batman",
                ocupacion = "CEO of Wayne Enterprises",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Batman_20190116_5c3fc4b40faec2.47318964.jpg"
            ),
            SuperHeroe(
                nombre = "Wonder Woman",
                poderes = "Super strength, invulnerability, flight, combat skill, combat strategy, superhuman agility, healing factor, magic weaponry",
                alias = "Diana Prince",
                ciudad = "Temiscira",
                facebook = "https://www.facebook.com/wonderwoman",
                ocupacion = "Secretary",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_WonderWoman_20190116_5c3fc6aa51d0e3.49076914.jpg"
            ),
            SuperHeroe(
                nombre = "Flash",
                poderes = "Super speed, intangibility, superhuman agility",
                alias = "Barry Allen, Jay Garrick, Wally West",
                ciudad = "Central City",
                facebook = "https://www.facebook.com/theflash",
                ocupacion = "Forensic scientist",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Flash_20190116_5c3fcaaa18f0e8.03668117.jpg"
                ),
            SuperHeroe(
                nombre = "Green Lantern",
                poderes = "Hard light constructs, instant weaponry, force fields, flight, durability, alien technology",
                alias = "Hal Jordan",
                ciudad = "Coast City",
                facebook = "",
                ocupacion = "Test pilot",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_GreenLantern_20200721_5f173ad01724e2.92436411.jpg"
            )
        )
    }*/
}