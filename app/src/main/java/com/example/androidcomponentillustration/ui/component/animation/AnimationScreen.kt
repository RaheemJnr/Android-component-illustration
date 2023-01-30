package com.example.androidcomponentillustration.ui.component.animation

import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AnimationScreen() {
    Scaffold(
        modifier = Modifier
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            Column(
                Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Infinite Transition",
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 100.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    val infiniteTransition = rememberInfiniteTransition()
                    // Vertically Bouncing animation using Multi State infinite transition
                    VerticalBouncingAnimation(infiniteTransition)
                    Spacer(modifier = Modifier.width(8.dp))
                    //horizontally Bounding heart icon
                    HorizontalBouncingIcon(infiniteTransition)
                    Spacer(modifier = Modifier.width(8.dp))
                    //pulsating icon
                    PulsatingHeartIcon(infiniteTransition)
                }
            }


        }

    }
}