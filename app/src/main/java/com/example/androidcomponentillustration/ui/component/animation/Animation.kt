package com.example.androidcomponentillustration.ui.component.animation

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
                val color by infiniteTransition.animateFloat(
                    initialValue = 0f,
                    targetValue = 1f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(100),
                        repeatMode = RepeatMode.Reverse
                    )
                )
//                val value by animateFloatAsState(
//                    targetValue = 1f,
//                    animationSpec = spring(
//                        dampingRatio = Spring.DampingRatioHighBouncy,
//                        stiffness = Spring.StiffnessMedium
//                    )
//                )


//                animateColor(
//                    initialValue = Color.Red,
//                    targetValue = Color.Green,
//                    animationSpec = infiniteRepeatable(
//                        animation = tween(1000, easing = LinearEasing),
//                        repeatMode = RepeatMode.Reverse
//                    )
//                )

                Box(Modifier.fillMaxSize()) {

                    Icon(
                        Icons.Default.Favorite,
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .offset(
                            y = color.dp
                        )
                    )
                }
            }
        }

    }
}