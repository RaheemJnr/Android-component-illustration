package com.example.androidcomponentillustration.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidcomponentillustration.ui.component.animation.SkeletonShimmerAnimation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

@Composable
fun SkeletonExampleScreen(

) {
    val loading = remember {
        mutableStateOf(false)
    }
    val scope = rememberCoroutineScope()


    LaunchedEffect(key1 = null) {
        loading.value = true
        val task = async(Dispatchers.IO) {
            delay(3000L)
        }
        task.await()
        // loading.value = false
    }

    ProfileView(loading = loading.value)
    //  loading.value = false


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
                        .clip(CircleShape)
                )


            },
            defaultView = {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                        .clip(CircleShape)
                )

            }
        )


        SkeletonShimmerAnimation(
            isLoading = loading,
            contentView = {
                Text(text = "Hi im new here")
            },
            defaultView = {
                Text(text = "              ")
            }
        )

    }


}