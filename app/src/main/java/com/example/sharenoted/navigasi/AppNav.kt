package com.example.sharenoted.navigasi

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sharenoted.ui.screen.HomeScreen
import com.example.sharenoted.ui.screen.LoginScreen
import com.example.sharenoted.ui.screen.RegistrasiScreen

@Composable
fun AppNav() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        // LOGIN
        composable("login") {

            LoginScreen(
                onSignUpClick = {
                    navController.navigate("registrasi")
                }
            )
        }

        // REGISTRASI
        composable("registrasi") {

            RegistrasiScreen(
                onLoginClick = {
                    navController.navigate("login")
                }
            )
        }

        // HOME
        composable("home") {

            HomeScreen()
        }
    }
}