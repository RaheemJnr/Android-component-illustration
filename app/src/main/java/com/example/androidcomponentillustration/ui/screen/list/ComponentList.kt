package com.example.androidcomponentillustration.ui.screen.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun ComponentListScreen() {
    Scaffold(
        Modifier
            .fillMaxSize()
            .padding(start = 1.dp, end = 1.dp, bottom = 62.dp)

    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .statusBarsPadding()
        ) {
            StatusPageHeading(
                modifier = Modifier.padding(horizontal = 16.dp),
                title = "Components",
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
            Spacer(modifier = Modifier.height(8.dp))
        }

    }

}