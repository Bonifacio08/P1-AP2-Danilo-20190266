package com.bonifaciotech.p1_ap2_danilo_20190266.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo

@Database(
    entities = [
        Prestamo::class
    ],
    exportSchema = false,
    version = 1
)

abstract class PrestamoDb:RoomDatabase() {
    abstract val prestamoDao:prestamoDao
}