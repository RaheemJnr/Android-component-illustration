package com.example.androidcomponentillustration.ui.screen.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidcomponentillustration.ui.component.StatusPageHeading

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
        }


    }

}