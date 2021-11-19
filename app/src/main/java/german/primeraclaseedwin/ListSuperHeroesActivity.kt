package german.primeraclaseedwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListSuperHeroesActivity : AppCompatActivity() {

    private lateinit var listaSuperheroes: ArrayList<SuperHeroe> //lateinit lo voy a inicializar despues
    private lateinit var superheroesAdapter: SuperHeroesAdapter
    private lateinit var superheroesRecyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_super_heroes)

        superheroesRecyclerview = findViewById(R.id.superheroes_recycler_view) //"Bindeo"

        listaSuperheroes = createMockSuperHeroes()

        superheroesAdapter = SuperHeroesAdapter(listaSuperheroes)

        superheroesRecyclerview.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = superheroesAdapter
            setHasFixedSize(false)
        }
    }

    private fun createMockSuperHeroes() : ArrayList<SuperHeroe>{
        return arrayListOf(
            SuperHeroe(
                nombre = "Superman",
                poderes= "Super strength, flight, invulnerability, super speed, heat vision, freeze breath, x-ray vision, superhuman hearing, healing factor",
                alias = "Clark Kent, Kal-El",
                ciudad = "Metropolis",
                facebook = "https://www.facebook.com/superman",
                ocupacion = "Reporter"
            ),
            SuperHeroe(
                nombre = "Batman",
                poderes= "Exceptional martial artist, combat strategy, inexhaustible wealth, brilliant deductive skill, advanced technology",
                alias = "Bruce Wayne",
                ciudad = "Gotham",
                facebook = "https://www.facebook.com/batman",
                ocupacion = "CEO of Wayne Enterprises"
            ),
            SuperHeroe(
                nombre = "Wonder Woman",
                poderes = "Super strength, invulnerability, flight, combat skill, combat strategy, superhuman agility, healing factor, magic weaponry",
                alias = "Diana Prince",
                ciudad = "Temiscira",
                facebook = "https://www.facebook.com/wonderwoman",
                ocupacion = "Secretary"
            ),
            SuperHeroe(
                nombre = "Flash",
                poderes = "Super speed, intangibility, superhuman agility",
                alias = "Barry Allen, Jay Garrick, Wally West",
                ciudad = "Central City",
                facebook = "https://www.facebook.com/theflash",
                ocupacion = "Forensic scientist"
                ),
            SuperHeroe(
                nombre = "Green Lantern",
                poderes = "Hard light constructs, instant weaponry, force fields, flight, durability, alien technology",
                alias = "Hal Jordan",
                ciudad = "Coast City",
                facebook = "",
                ocupacion = "Test pilot"
                )
        )
    }
}