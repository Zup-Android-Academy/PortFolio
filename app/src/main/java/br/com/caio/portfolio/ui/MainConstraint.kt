package br.com.caio.portfolio.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.caio.portfolio.R
import br.com.caio.portfolio.dto.Info

class MainConstraint : AppCompatActivity() {

    private val botaoRelative by lazy { findViewById<Button>(R.id.botaoRelative) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainconstraint)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        botaoRelative.setOnClickListener {
            val intent = Intent(this, RelativeTela::class.java)
            startActivity(intent)
        }


    }
}
