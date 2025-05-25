package com.panifacil.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        btnRegistrar.setOnClickListener {
            val pedido = Pedido(
                cliente = "Laticínios Bom Gosto",
                tipo = "Pão de cachorro-quente",
                quantidade = 50,
                data = "25/05/2025",
                entregue = false
            )
            FirebaseService.salvarPedido(pedido)
        }
    }
}
