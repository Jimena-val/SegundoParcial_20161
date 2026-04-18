package com.example.segundoparcial_20161

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.segundoparcial_20161.ui.theme.SegundoParcial_20161Theme
//import com.example.SegundoParcial_20161.ui.theme.SegundoParcial_20161Theme
import com.example.segundoparcial_20161.ui.theme.libro.NavManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SegundoParcial_20161Theme {
                NavManager()
            }
        }
    }
}