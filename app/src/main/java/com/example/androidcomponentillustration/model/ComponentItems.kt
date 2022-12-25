package com.example.androidcomponentillustration.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.example.androidcomponentillustration.R


@Stable
@Immutable
data class ComponentItems(val name: String = "", val icon: Int, val routeName: String = "")


val listItems = listOf(
    ComponentItems("Text View", icon = R.drawable.text_view, routeName = "TextView"),
    ComponentItems("Animations", icon = R.drawable.animation, routeName = "Animation")
)