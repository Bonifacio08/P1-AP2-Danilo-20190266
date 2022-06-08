package com.bonifaciotech.p1_ap2_danilo_20190266.ui.registro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Registro() {

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registro") })
        },

        scaffoldState = scaffoldState
    ) {
        Column(modifier = Modifier.padding(it).padding(8.dp)) {

        }
    }

}