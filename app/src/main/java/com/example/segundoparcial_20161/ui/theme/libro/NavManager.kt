package com.example.segundoparcial_20161.ui.theme.libro

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Inicio

@Serializable
object PantallaDragones

@Serializable
object PantallaInformativa

@Composable


fun NavManager (){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = Inicio, modifier = Modifier.padding()){
        composable<Inicio> {
            PantallaInicio(navController)
        }
        composable<PantallaDragones> {
            PantallaDragones(navegante = navController)
        }
        composable<PantallaInformativa>{
            PantallaInformativa(navegante= navController)
        }
    }
}