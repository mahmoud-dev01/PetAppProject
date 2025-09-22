package org.example.petapp

import androidx.compose.ui.window.ComposeUIViewController
import org.example.petapp.ui.SplashScreen
import org.example.petapp.ui.home.HomeScreen

fun MainViewController() = ComposeUIViewController {
    //SplashScreen()
    HomeScreen()
}