package br.com.devmobile.imcfacil

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devmobile.imcfacil.databinding.ActivityCalculoImcactivityBinding

class CalculoIMCActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityCalculoImcactivityBinding.inflate(layoutInflater) }

    private var imc: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/


        binding.btCalcular.setOnClickListener {
              calcularIMC()
        }

    }

    fun calcularIMC(){
           val peso = binding.editPeso.text.toString().replace(",", ".")
           val altura = binding.editAltura.text.toString().replace(",", ".")


           if(peso.isNotEmpty() && altura.isNotEmpty()){

               val pesoConvertido =  peso.toDouble()
               val alturaConvertida = altura.toDouble()

                imc = pesoConvertido / (alturaConvertida * alturaConvertida)
                val intent = Intent(this, ResultadoIMCActivity::class.java)
                intent.putExtra("IMC", imc)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

           }else{
               Toast.makeText(this, "Existem campos vázioz", Toast.LENGTH_SHORT).show()
           }


    }

}