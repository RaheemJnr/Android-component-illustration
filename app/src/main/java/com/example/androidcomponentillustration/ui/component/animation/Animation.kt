package com.example.androidcomponentillustration.ui.component.animation

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun HorizontalAndVerticalAnimation() {
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


@Composable
fun PulsatingHeartIcon(infiniteTransition: InfiniteTransition) {
    val floatAnim by infiniteTransition.animateFloat(
        initialValue = 10f,
        targetValue = 60f,
        animationSpec = infiniteRepeatable(tween(1200), RepeatMode.Reverse)
    )
    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "",
        modifier = Modifier
            .size(floatAnim.dp)
            .offset(
                x = 10.dp, y = 10.dp
            )
    )
}

@Composable
fun HorizontalBouncingIcon(infiniteTransition: InfiniteTransition) {
    val startColor = Color.Green
    val endColor = Color.Black

    val animatedColor by infiniteTransition.animateColor(
        initialValue = startColor,
        targetValue = endColor,
        animationSpec = infiniteRepeatable(
            tween(800, easing = FastOutLinearInEasing),
            RepeatMode.Reverse,
        )
    )
    val position by infiniteTransition.animateFloat(
        initialValue = -60f,
        targetValue = 60f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                800,
                easing = FastOutLinearInEasing
            ),
            repeatMode = RepeatMode.Reverse
        )
    )

    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "",
        tint = animatedColor,
        modifier = Modifier
            .size(50.dp)
            .offset(x = position.dp)
    )
}

@Composable
fun VerticalBouncingAnimation(infiniteTransition: InfiniteTransition) {
    // start and end color for icon
    val startColor = Color.Green
    val endColor = Color.Black

    val animatedColor by infiniteTransition.animateColor(
        initialValue = startColor,
        targetValue = endColor,
        animationSpec = infiniteRepeatable(
            tween(800, easing = FastOutLinearInEasing),
            RepeatMode.Reverse,
        )
    )

    val position by infiniteTransition.animateFloat(
        initialValue = -50f,
        targetValue = 50f,
        animationSpec = infiniteRepeatable(tween(1000), RepeatMode.Reverse)
    )

    Icon(
        Icons.Default.Favorite,
        tint = animatedColor,
        contentDescription = "Heart Icon",
        modifier = Modifier
            .size(50.dp)
            .offset(y = position.dp)
    )
}