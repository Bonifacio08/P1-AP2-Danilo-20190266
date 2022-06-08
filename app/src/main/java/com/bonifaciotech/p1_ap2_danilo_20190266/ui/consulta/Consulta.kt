package com.bonifaciotech.p1_ap2_danilo_20190266.ui.consulta

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Consulta(IrRegistro: ()-> Unit) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
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
        Column(modifier = Modifier.padding(it).padding(8.dp)) {
            LazyColumn(modifier = Modifier.fillMaxSize()){

            }
        }
    }

}