package com.example.androidcomponentillustration.ui.screen.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidcomponentillustration.navigation.Destination
import com.example.androidcomponentillustration.ui.component.StatusPageHeading
import com.example.androidcomponentillustration.ui.component.animation.Animation
import com.example.androidcomponentillustration.ui.component.textField.TextFields

@Composable
fun ComponentImplScreen(
    screenType: String
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { contentPadding ->

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .statusBarsPadding()
        ) {
            StatusPageHeading(
                modifier = Modifier.padding(horizontal = 16.dp),
                title = screenType,
                extraItems = {
                    IconButton(
                        modifier = Modifier.background(
                            MaterialTheme.colors.surface.copy(alpha = 0.6f),
                            CircleShape
                        ),
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.MoreVert,
                            contentDescription = "MoreVert",
                            tint = MaterialTheme.colors.onSurface

                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(8.dp))

            when (screenType) {
                Destination.TextField.route -> {
                   TextFields()
                }
                Destination.Animation.route -> {
                    Animation()
                }
                else -> {
                    Text(text = "Well not here")
                }

            }
        }
    }

}