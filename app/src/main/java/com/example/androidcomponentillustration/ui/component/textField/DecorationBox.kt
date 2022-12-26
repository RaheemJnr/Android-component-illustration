package com.example.androidcomponentillustration.ui.component.textField

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFields() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { contentPadding ->
        Column(
            Modifier.padding(contentPadding)
        ) {
            var input by remember { mutableStateOf("") }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(vertical = 12.dp)
            ) {
                BasicTextField(
                    value = input,
                    onValueChange = {
                        input = it
                    }
                )
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    TextFields()
}