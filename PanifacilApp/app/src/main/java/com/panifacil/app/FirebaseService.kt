package com.panifacil.app

import com.google.firebase.database.FirebaseDatabase

object FirebaseService {
    private val db = FirebaseDatabase.getInstance().getReference("pedidos")

    fun salvarPedido(pedido: Pedido) {
        val id = db.push().key ?: return
        db.child(id).setValue(pedido.copy(id = id))
    }
}
