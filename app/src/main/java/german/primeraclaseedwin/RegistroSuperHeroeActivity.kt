package german.primeraclaseedwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class RegistroSuperHeroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_super_heroe)

        //val dato=3 Esta es inmutable
        //var data=5

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_text_view)
        val estaturaEditText: TextInputEditText = findViewById(R.id.estatura_edit_text)
        val masculinoRadioButton: RadioButton = findViewById(R.id.masculino_radio_button)
        val femeninoRadioButton: RadioButton = findViewById(R.id.femenino_radio_button)
        val fuerzaCheckBox: CheckBox = findViewById(R.id.super_fuerza_checkBox)
        val velocidadCheckBox: CheckBox = findViewById(R.id.velocidad_checkBox)
        val telequinesisCheckBox: CheckBox = findViewById(R.id.telequinesis_checkBox)
        val ciudadSpiner: Spinner = findViewById(R.id.ciudad_spinner)

        registrarButton.setOnClickListener{
            val nombre : String = nombreEditText.text.toString()
            val estatura : Float = estaturaEditText.text.toString().toFloat()
            val genero: String
            var poderes = ""
            val ciudad = ciudadSpiner.selectedItem.toString()

            if (masculinoRadioButton.isChecked)
                genero = getString(R.string.masculino)
            else
                genero = getString(R.string.femenino)

            if (fuerzaCheckBox.isChecked)
                poderes = getString(R.string.super_fuerza)
            if (velocidadCheckBox.isChecked)
                poderes = poderes + " " + getString(R.string.velocidad)
            if (telequinesisCheckBox.isChecked)
                poderes = poderes + " " + getString(R.string.telequinesis)

            infoTextView.text = getString(R.string.nombre_para_registro,nombre,estatura,genero,poderes,ciudad)
        }
    }
}