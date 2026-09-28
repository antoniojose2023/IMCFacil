package br.com.devmobile.imcfacil

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devmobile.imcfacil.databinding.ActivityResultadoImcactivityBinding
import java.text.DateFormat
import java.util.Locale

class ResultadoIMCActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityResultadoImcactivityBinding.inflate(layoutInflater) }

    private var imc = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/


        imc = intent.getDoubleExtra("IMC", 0.0)
        retornaResultadoIMC(imc)


        binding.ivVoltar.setOnClickListener {
              finish()
        }

        binding.btCalcularNovamente.setOnClickListener {
              finish()
        }


    }

    fun retornaResultadoIMC(imc: Double){
            val imcFomartado = String.format(Locale.forLanguageTag("pt-BR"), "%.1f", imc)
            binding.tvResultadoIMC.text = imcFomartado


           if(imc < 18.5){
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado_laranja )
               binding.tvResultadotexto.text = "Abaixo do peso"
               binding.tvDicaResultado.text = "Seu IMC está abaixo da faixa considerada saudável. Pode ser interessante conversar com um médico ou nutricionista para avaliar se sua alimentação está fornecendo os nutrientes necessários."

           }else if((imc >= 18.5) && (imc <= 24.9)){
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado )
               binding.tvResultadotexto.text = "Peso normal"
               binding.tvDicaResultado.text = "Seu IMC está dentro da faixa considerada saudável pela Organização Mundial da Saúde. Continue mantendo hábitos equilibrados de alimentação e atividade física."

           }else if((imc >= 25.0) && (imc <= 29.9)){
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado_amarelo )
               binding.tvResultadotexto.text = "Sobrepeso"
               binding.tvDicaResultado.text = "Seu IMC está um pouco acima da faixa considerada ideal. Pequenos ajustes na alimentação e na rotina de exercícios podem ajudar a trazer esse número para a faixa saudável."

           }else if((imc >= 30.0) && (imc <= 34.9)){
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado_azul90 )
               binding.tvResultadotexto.text = "Obesidade Grau I"
               binding.tvDicaResultado.text = "Seu IMC indica obesidade grau I. É recomendável buscar orientação médica ou nutricional para montar um plano de cuidados com sua saúde."
           }else if((imc>= 35.0) && (imc <= 39.9)){
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado_azul_claro )
               binding.tvResultadotexto.text = "Obesidade Grau II"
               binding.tvDicaResultado.text = "Seu IMC indica obesidade grau II, associada a maior risco de complicações de saúde. O acompanhamento com um profissional de saúde é importante para orientar os próximos passos."
           }else {
               binding.tvResultadotexto.setBackgroundResource( R.drawable.fundo_texto_resultado_azul )
               binding.tvResultadotexto.text = "Obesidade Grau III"
               binding.tvDicaResultado.text = "Seu IMC indica obesidade grau III, um grau que exige atenção médica mais próxima. Buscar acompanhamento especializado é fundamental para cuidar da sua saúde."
           }

    }
}