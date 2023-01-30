package com.example.androidcomponentillustration.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidcomponentillustration.ui.component.animation.SkeletonShimmerAnimation

@Composable
fun SkeletonExampleScreen(

) {

    val loading = remember {
        mutableStateOf(false)
    }


    ProfileView(loading = loading.value)


}


@Composable
fun ProfileView(
    loading: Boolean
) {
    Column {
        SkeletonShimmerAnimation(
            isLoading = loading,
            contentView = {

                Image(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(250.dp)
                        .clip(CircleShape)
                )


            },
            defaultView = {
                Box(
                    modifier = Modifier
                        .size(250.dp)
                        .background(Color.Blue)
                        .clip(CircleShape)
                )

            }
        )


        SkeletonShimmerAnimation(
            isLoading = loading,
            contentView = {

            },
            defaultView = {
                Text(text = "           ")
            }
        )

    }


}