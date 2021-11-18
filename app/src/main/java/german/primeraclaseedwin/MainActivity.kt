package german.primeraclaseedwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre = intent.extras?.getString("nombre")

        nombre?.let { Log.d("nombre", it) }
    }
}
//Config develop