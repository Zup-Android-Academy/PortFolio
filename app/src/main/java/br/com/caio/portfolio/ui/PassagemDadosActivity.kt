package br.com.caio.portfolio.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.caio.portfolio.R
import br.com.caio.portfolio.dto.Info

class PassagemDadosActivity : AppCompatActivity() {

    private var text: String? = ""
    private val btnConstraint by lazy { findViewById<Button>(R.id.btnConstraint) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passagem_dados)

        setOnClickListeners()
        val info = intent.getParcelableExtra("info") as? Info

        with(findViewById<TextView>(R.id.name)) {
            text = info?.nome
            this@PassagemDadosActivity.text = info?.nome
        }
    }


     private fun setOnClickListeners() {
            btnConstraint.setOnClickListener {
                val intent = Intent(this, MainConstraint::class.java)
                startActivity(intent)
            }

        }
    }

