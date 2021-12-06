package german.dccomics.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import german.dccomics.model.SuperHeroe
import german.dccomics.model.SuperHeroeItem
import java.io.InputStream

class ListViewModel : ViewModel() {

    private var superheroesLoad : MutableLiveData<ArrayList<SuperHeroeItem>> = MutableLiveData()
    val onSuperheroesLoaded: LiveData<ArrayList<SuperHeroeItem>> = superheroesLoad

    fun loadMockSuperHeroesFromJson(superheroesString: InputStream?) {
        val superheroeString = superheroesString?.bufferedReader().use { it!!.readText() }
        val gson = Gson()
        superheroesLoad.value = gson.fromJson(superheroeString, SuperHeroe::class.java)
    }


}