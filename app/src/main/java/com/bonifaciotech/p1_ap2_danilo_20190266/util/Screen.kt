package com.bonifaciotech.p1_ap2_danilo_20190266.util

sealed class Screen(val route: String) {
    object Registro : Screen("Registro")
    object Consulta : Screen("Consulta")
}