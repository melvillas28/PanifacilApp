package com.panifacil.app

data class Pedido(
    val id: String = "",
    val cliente: String = "",
    val tipo: String = "",
    val quantidade: Int = 0,
    val data: String = "",
    val entregue: Boolean = false
)
