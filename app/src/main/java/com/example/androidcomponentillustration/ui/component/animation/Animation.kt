package com.example.androidcomponentillustration.ui.component.animation

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Animation() {
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
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
            ) {
                val infiniteTransition = rememberInfiniteTransition()
                //
                val startColor = Color.Green
                val endColor = Color.Yellow

                val animatedColor by infiniteTransition.animateColor(
                    initialValue = startColor,
                    targetValue = endColor,
                    animationSpec = infiniteRepeatable(tween(800), RepeatMode.Reverse)
                )

                val position by infiniteTransition.animateFloat(
                    initialValue = -80f,
                    targetValue = 80f,
                    animationSpec = infiniteRepeatable(tween(800), RepeatMode.Reverse)
                )

                Box(Modifier.fillMaxSize()) {
                    Icon(
                        Icons.Default.Favorite,
                        tint = animatedColor,
                        contentDescription = "",
                        modifier = Modifier
                            .size(150.dp)
                            .offset(
                                y = position.dp
                            )
                    )
                }
            }
        }

    }
}