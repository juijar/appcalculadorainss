package com.samuelalmeida.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.samuelalmeida.calculadora.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var viewScreen : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewScreen = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewScreen.root)


    }
        fun calcularInss(){
            viewScreen.btn.setOnClickListener(){
                var entrada : EditText = viewScreen.input
                var salario = entrada.text.toString().toFloat()
                var total : EditText = viewScreen.total
                when(salario){
                    in 1212.0..1212.0->{
                        var calculo = salario/100*7.5.roundToInt()
                        total.setText(calculo.toString())
                    }
                    in 1212.0..1212.0->{
                        var calculo = salario/100*7.5.roundToInt()
                        total.setText(calculo.toString())
                    }
                }
            }
        }
}