package german.primeraclaseedwin.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import german.primeraclaseedwin.R
import german.primeraclaseedwin.model.SuperHeroeItem

class SuperHeroesAdapter(
    private val superheroesList: ArrayList<SuperHeroeItem>,
    private val onItemClicked: (SuperHeroeItem)->Unit //Estoy mandando un tipo de dato, podria ser un entero o un booleano
    ): RecyclerView.Adapter<SuperHeroesAdapter.ViewHolder>() { //dentro de <> coloco un viewholder que gestiona el contenido de la vista

    //Cual es nuestro Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_superheroe_iterm,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //cuantas veses va a iterar de acuerdo al numero de heroes en la lista
        val superHeroe = superheroesList[position]
        holder.itemView.setOnClickListener{onItemClicked(superheroesList[position])}
        holder.bind(superHeroe)
    }

    // tamaño de la lista
    override fun getItemCount(): Int {
        return superheroesList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){ //aca vamos a "pintar"
        private var nameTextView: TextView = itemView.findViewById(R.id.textView7)
        private var aliasTextView: TextView = itemView.findViewById(R.id.textView8)
        private var pictureImageView: ImageView = itemView.findViewById(R.id.imageView2)

        fun bind(superHeroe: SuperHeroeItem){
            nameTextView.text = superHeroe.name
            aliasTextView.text = superHeroe.size.toString()
            Picasso.get().load(superHeroe.urlPicture).into(pictureImageView)
        }
    }
}