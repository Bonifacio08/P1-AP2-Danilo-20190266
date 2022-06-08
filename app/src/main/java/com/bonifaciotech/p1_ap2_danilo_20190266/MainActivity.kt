package com.bonifaciotech.p1_ap2_danilo_20190266

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bonifaciotech.p1_ap2_danilo_20190266.ui.consulta.Consulta
import com.bonifaciotech.p1_ap2_danilo_20190266.ui.registro.Registro
import com.bonifaciotech.p1_ap2_danilo_20190266.ui.theme.P1AP2Danilo20190266Theme
import com.bonifaciotech.p1_ap2_danilo_20190266.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P1AP2Danilo20190266Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.Consulta.route){
        composable(route = Screen.Consulta.route){
            Consulta(IrRegistro = {navHostController.navigate(Screen.Registro.route)})
        }
        composable(route = Screen.Registro.route){
            Registro()
        }
    }
}







@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    P1AP2Danilo20190266Theme {
        MyApp()
    }
}