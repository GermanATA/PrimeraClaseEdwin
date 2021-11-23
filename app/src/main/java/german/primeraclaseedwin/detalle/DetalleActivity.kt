package german.primeraclaseedwin.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.squareup.picasso.Picasso
import german.primeraclaseedwin.R
import german.primeraclaseedwin.databinding.ActivityDetalleBinding
import german.primeraclaseedwin.model.SuperHeroeItem
import java.io.Serializable

class DetalleActivity : AppCompatActivity() {

    private lateinit var detallebinding: ActivityDetalleBinding //lateinit para variables globales

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detallebinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detallebinding.root)

        var SH: SuperHeroeItem = intent.extras?.getSerializable("superheroe") as SuperHeroeItem

        with(detallebinding){
            nameTextView.text = SH.name
            aliasTextView.text = SH.alias
            cityTextView.text = SH.city
            ocupacionTextView.text=SH.occupation
            estaturaTextView.text = SH.size.toString()
            facebookTextView.text = SH.facebook
            powersTextView.text = SH.powers
            Picasso.get().load(SH.urlPicture).into(pictureImageView)



        }

    }
}
