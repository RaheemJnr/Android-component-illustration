package com.example.androidcomponentillustration.ui.component.animation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomponentillustration.ui.screen.SkeletonExampleScreen


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
                    Spacer(modifier = Modifier.height(8.dp))
                    //bouncing and pulsating animation
                    HorizontalAndVerticalAnimation()
                    Spacer(modifier = Modifier.height(12.dp))
                    //skeleton animation


                }
            }


        }

    }
}