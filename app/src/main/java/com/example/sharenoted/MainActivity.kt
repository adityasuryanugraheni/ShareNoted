package com.example.sharenoted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sharenoted.navigasi.AppNav // Import dari package navigasi
import com.example.sharenoted.ui.theme.ShareNotedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShareNotedTheme {
                // Sekarang MainActivity cukup panggil AppNav
                // Semua logika if-else sudah pindah ke package navigasi
                AppNav()
            }
        }
    }
}