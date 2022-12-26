package com.example.androidcomponentillustration.ui.component.textField

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFields() {
    Scaffold(
        modifier = Modifier
    ) { contentPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            var input by remember { mutableStateOf("") }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
            ) {
                BasicTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 1.5.dp, color = Color.Black)
                        .padding(12.dp),
                    value = input,
                    onValueChange = {
                        input = it
                    },
                    decorationBox = { innerTextField ->
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Hi enter your text")
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.Person, contentDescription = "")
                                innerTextField()
                                Icon(Icons.Rounded.Check, contentDescription = "")

                            }
                        }

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