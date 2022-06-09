package com.bonifaciotech.p1_ap2_danilo_20190266.data

import androidx.room.*
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo
//import java.util.concurrent.Flow
import kotlinx.coroutines.flow.Flow

@Dao
interface prestamoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(prestamo: Prestamo)

    @Delete
    suspend fun eliminar(prestamo: Prestamo)

    @Query("SELECT * FROM Prestamos WHERE prestamoid = :prestamoid")
    fun buscar(prestamoid: Int): Flow<Prestamo>

    @Query("SELECT * FROM Prestamos ORDER BY prestamoid")
    fun getListPrestamo(): Flow<List<Prestamo>>



}