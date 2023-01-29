package com.example.androidcomponentillustration.ui.component.animation

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize


@Composable
fun Skeleton(
    modifier: Modifier = Modifier,
    isLoading: Boolean = false,
    contentView: @Composable () -> Unit = {},
    defaultView: (@Composable () -> Unit)? = null,

) {
    val defaultSize = remember { mutableStateOf(IntSize.Zero) }

    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(shape = RectangleShape)
            .onSizeChanged {
                defaultSize.value = it
            },
        contentAlignment = Alignment.Center
    ) {
        contentView()

        if (isLoading) {
            defaultView?.let { view ->
                view()
            }


            val animateColor = remember { Animatable(Color.LightGray) }

            val animationTogqle = remember { mutableStateOf(false) }
            if (animationTogqle.value) {
                LaunchedEffect(key1 = null) {
                    animateColor.animateTo(
                        targetValue = Color.Gray,
                        animationSpec = tween(400)
                    )
                    animationTogqle.value = false
                }
            } else {
                LaunchedEffect(key1 = null) {
                    animateColor.animateTo(
                        targetValue = Color.LightGray,
                        animationSpec = tween(400)
                    )
                    animationTogqle.value = false
                }
            }
            Box(
                modifier = modifier
                    .background(animateColor.value)
                    .then(
                        with(LocalDensity.current) {
                            Modifier.size(
                                width = defaultSize.value.width.toDp(),
                                height = defaultSize.value.height.toDp()
                            )
                        }
                    )
            )
        }
    }

}
