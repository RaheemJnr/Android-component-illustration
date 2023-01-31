package com.example.androidcomponentillustration.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.androidcomponentillustration.ui.component.animation.SkeletonShimmerAnimation
import kotlinx.coroutines.delay

@Composable
fun SkeletonExampleScreen(

) {
    val loading = remember {
        mutableStateOf(false)
    }


    LaunchedEffect(key1 = null) {
        loading.value = true

        delay(5000L)

        loading.value = false
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
                    imageVector = Icons.Default.Person,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(50.dp)

                )


            },
            defaultView = {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White)
                        .padding(6.dp)
                )

            },
            shape = CircleShape
        )
        Spacer(modifier = Modifier.height(6.dp))
        SkeletonShimmerAnimation(
            isLoading = loading,
            contentView = {
                Text(
                    text = "Hi im new here"
                )
            },
            shape = RectangleShape
        )

    }


}