package com.example.androidcomponentillustration.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable


@Stable
@Immutable
data class ListItems(val name: String = "")


val listItems = listOf(
    ListItems("Text View"),
    ListItems("Animations")
)