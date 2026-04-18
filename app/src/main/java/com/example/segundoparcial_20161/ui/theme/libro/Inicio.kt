package com.example.segundoparcial_20161.ui.theme.libro

import com.example.segundoparcial_20161.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController



@Composable
fun PantallaInicio(navegante: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.libro),
            contentDescription = "libro",
            modifier = Modifier.size(500.dp)
        )
        Button(
            onClick = {
                navegante.navigate(PantallaDragones)
            }
        ) {
            Text(text = "Abrir")
        }
    }
}