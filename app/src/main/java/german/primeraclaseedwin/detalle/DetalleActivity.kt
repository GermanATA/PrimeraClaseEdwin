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
            if (nameTextView != null) {
                nameTextView.text = SH.name
            }
            if (aliasTextView != null) {
                aliasTextView.text = SH.alias
            }
            if (cityTextView != null) {
                cityTextView.text = SH.city
            }
            if (ocupacionTextView != null) {
                ocupacionTextView.text=SH.occupation
            }
            if (estaturaTextView != null) {
                estaturaTextView.text = SH.size.toString()
            }
            if (facebookTextView != null) {
                facebookTextView.text = SH.facebook
            }
            if (powersTextView != null) {
                powersTextView.text = SH.powers
            }
            Picasso.get().load(SH.urlPicture).into(pictureImageView)
        }

    }
}
