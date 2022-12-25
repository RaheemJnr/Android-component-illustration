package com.example.androidcomponentillustration.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector


@Stable
@Immutable
data class ComponentItems(val name: String = "", val icon: ImageVector, val routeName: String = "")


val listItems = listOf(
    ComponentItems("Text View", icon = Icons.Default.List, routeName = "TextView"),
    ComponentItems("Animations", icon = Icons.Default.MoreVert, routeName = "Animation")
)