package br.com.caio.portfolio.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import br.com.caio.portfolio.R
import br.com.caio.portfolio.dto.Info

class MainActivity : AppCompatActivity() {
    private val desafio1 by lazy { findViewById<Button>(R.id.desafio_1) }
    private val desafio2 by lazy { findViewById<Button>(R.id.desafio_2) }
    private val desafio3 by lazy { findViewById<Button>(R.id.desafio_3) }
    private val desafio4 by lazy { findViewById<Button>(R.id.desafio_4) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListeners()
    }

    private fun String.showMen() {
        Toast.makeText(this@MainActivity, this, Toast.LENGTH_SHORT).show()
    }

    private fun setOnClickListeners() {
        desafio1.setOnClickListener {
            val intent = Intent(this, PassagemDadosActivity::class.java)

            intent.putExtra("info", Info("Caio Novoa Antunes"))

            startActivity(intent)
        }

        desafio2.setOnClickListener {
            "Desafio 2".showMen()

        }

        desafio3.setOnClickListener {
            "Desafio 3".showMen()
        }

        desafio4.setOnClickListener {
            "Desafio 4".showMen()
        }
    }
}
