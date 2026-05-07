package com.example.sharenoted

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Write, share, and connect through notes.",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),

            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            )
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text("Email")

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text("name@example.com")
                    },

                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text("Password")

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = PasswordVisualTransformation(),

                    placeholder = {
                        Text("Enter your password")
                    },

                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2979FF)
                    )

                ) {

                    Text("Log In")

                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {

            Text("Don't have an account? ")

            Text(
                text = "Sign up",
                color = Color(0xFF2979FF)
            )

        }

    }

}