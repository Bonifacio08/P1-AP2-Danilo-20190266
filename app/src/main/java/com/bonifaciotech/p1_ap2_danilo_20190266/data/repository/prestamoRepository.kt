package com.bonifaciotech.p1_ap2_danilo_20190266.data.repository

import com.bonifaciotech.p1_ap2_danilo_20190266.data.prestamoDao
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo
//import java.util.concurrent.Flow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class prestamoRepository @Inject constructor(
    val prestamoDao: prestamoDao
) {

    suspend fun insertar(prestamo: Prestamo){
        prestamoDao.insertar(prestamo)
    }

    suspend fun eliminar(prestamo: Prestamo){
        prestamoDao.eliminar(prestamo)
    }

    fun buscar(prestamoid: Int): Flow<Prestamo>{
        return prestamoDao.buscar(prestamoid)
    }

    fun getListPrestamo(): Flow<List<Prestamo>>{
        return prestamoDao.getListPrestamo()
    }

}