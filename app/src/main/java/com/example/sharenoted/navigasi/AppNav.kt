package com.example.sharenoted.navigasi

import androidx.compose.runtime.*
import com.example.sharenoted.LoginScreen
import com.example.sharenoted.registrasi.RegistrasiScreen

/**
 * File ini berfungsi sebagai pengatur lalu lintas (Navigasi)
 * yang memisahkan logika perpindahan layar dari MainActivity.
 */
@Composable
fun AppNav() {
    // State untuk memantau layar mana yang sedang aktif
    var currentScreen by remember { mutableStateOf("login") }

    if (currentScreen == "login") {
        LoginScreen(
            onSignUpClick = { currentScreen = "registrasi" }
        )
    } else {
        RegistrasiScreen(
            onLoginClick = { currentScreen = "login" }
        )
    }
}