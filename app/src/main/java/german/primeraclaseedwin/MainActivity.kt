package german.primeraclaseedwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tituloTextView : TextView = findViewById(R.id.textView)

        var nombre = intent.extras?.getString("nombre")
        tituloTextView.text = nombre

        nombre?.let { Log.d("nombre", it) }
    }
}
//Config develop