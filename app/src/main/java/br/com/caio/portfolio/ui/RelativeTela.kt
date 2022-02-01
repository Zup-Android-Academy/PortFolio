package br.com.caio.portfolio.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.caio.portfolio.R
import br.com.caio.portfolio.dto.Info

class RelativeTela : AppCompatActivity() {

    private val voltarInicio by lazy { findViewById<Button>(R.id.voltarInicio) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relativetela)

    setOnClickListeners()
    }

    private fun setOnClickListeners() {
        voltarInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}