package com.bonifaciotech.p1_ap2_danilo_20190266.ui.registro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bonifaciotech.p1_ap2_danilo_20190266.ui.prestamo.viewmodel

@Composable
fun Registro(
    viewModel: viewmodel = hiltViewModel()
) {

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registro de Prestamos") })
        },
        floatingActionButton = {
               FloatingActionButton(
                   onClick = {
                       viewModel.guardar()
                   },
                   backgroundColor = MaterialTheme.colors.primary


               ) {
                   Icon(imageVector = Icons.Default.Save, contentDescription = null)
               }
        },

        scaffoldState = scaffoldState
    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {

            OutlinedTextField(
                label = {
                    Text(text = "Deudor")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                },
                value = viewModel.deudor,
                onValueChange = {viewModel.deudor = it},
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                label = {
                    Text(text = "Concepto")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                },
                value = viewModel.concepto,
                onValueChange = {viewModel.concepto = it},
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                label = {
                    Text(text = "Monto")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.MonetizationOn, contentDescription = null)
                },
                value = viewModel.monto,
                onValueChange = {viewModel.monto = it},
                modifier = Modifier.fillMaxWidth()
            )






        }
    }

}