package com.first.dhivaapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.first.dhivaapplication.ui.theme.DhivaApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DhivaApplicationTheme {
                RegistrationForm()
            }
        }
    }
}

@Composable
fun RegistrationForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome, User!", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Please enter your details:", style = MaterialTheme.typography.bodyLarge)

        // Use remember to hold state
        var name by remember { mutableStateOf("") }
        var dob by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }

        // Name Input
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Enter your name") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        )

        // Date of Birth Input
        TextField(
            value = dob,
            onValueChange = { dob = it },
            label = { Text("MM/DD/YYYY") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        )

        // Email Input
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter your email") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        )

        // Submit Button
        Button(
            onClick = { /* Handle submit logic here */ },
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text("Submit")
        }
    }
}
