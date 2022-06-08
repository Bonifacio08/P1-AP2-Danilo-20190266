package com.bonifaciotech.p1_ap2_danilo_20190266.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bonifaciotech.p1_ap2_danilo_20190266.data.repository.prestamoRepository
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class viewmodel @Inject constructor(
    val prestamoRepository: prestamoRepository
):ViewModel(){

    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")

    var prestamo = prestamoRepository.getListPrestamo()
    private set

    fun guardar(){
        viewModelScope.launch {
            prestamoRepository.insertar(
                Prestamo(

                    deudor = deudor,
                    concepto = concepto,
                    monto = monto.toFloat()
                )
            )
        }
    }


}