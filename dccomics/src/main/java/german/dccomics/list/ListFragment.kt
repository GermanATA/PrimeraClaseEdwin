package german.dccomics.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import german.dccomics.databinding.FragmentListBinding
import german.dccomics.model.SuperHeroe
import german.dccomics.model.SuperHeroeItem

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private lateinit var superheroesAdapter: SuperHeroesAdapter
    private lateinit var listaSuperheroes: ArrayList<SuperHeroeItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listaSuperheroes=loadMockSuperHeroesFromJson()
        superheroesAdapter = SuperHeroesAdapter(listaSuperheroes,onItemClicked = {onSuperheroeClicked(it)} )
    }

    private fun onSuperheroeClicked(superheroe: SuperHeroeItem) {

    }

    private fun loadMockSuperHeroesFromJson(): ArrayList<SuperHeroeItem> {

        val superheroesString: String = context?.assets?.open("superheroes.json")?.bufferedReader().use { it!!.readText() }
        val gson = Gson()
        val data = gson.fromJson(superheroesString, SuperHeroe::class.java)
        return data

    }

}