package com.bonifaciotech.p1_ap2_danilo_20190266.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Prestamos")
data class Prestamo(
    @PrimaryKey(autoGenerate = true)
    val prestamoid: Int = 0,
    val deudor: String,
    val concepto: String,
    val monto: Float = 0f
)