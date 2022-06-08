package com.bonifaciotech.p1_ap2_danilo_20190266.ui.consulta

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo
import com.bonifaciotech.p1_ap2_danilo_20190266.ui.viewmodel.viewmodel

@Composable
fun Consulta(
    IrRegistro: ()-> Unit,
    viewmodel: viewmodel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta de Prestamos") })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    IrRegistro()
                }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
        },
        scaffoldState = rememberScaffoldState()
    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {
            
            val lisPrestamo = viewmodel.prestamo.collectAsState(initial = emptyList()).value
            LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(lisPrestamo){prestamo->
                    RowPrestamo(prestamo)
                }
            }
        }
    }

}

@Composable
fun RowPrestamo(prestamo: Prestamo) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text("Deudor: ${prestamo.deudor}")
        Text("Concepto: ${prestamo.concepto}")
        Text("Monto: ${prestamo.monto}")
    }
    
}