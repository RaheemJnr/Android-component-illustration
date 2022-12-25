package com.example.androidcomponentillustration.navigation

sealed class MainScreen(
    val route: String,
    val title: String,
) {
    object ComponentList : MainScreen(route = "Component List", title = "Component List")

    object ComponentImpl :
        MainScreen(route = "Component Impl", title = "Component Implementation")

}


sealed class Destination(
    val route: String
) {
    object TextView : Destination(route = "TextView")
    object Animation : Destination(route = "Animation")
 //   object TextView : Destination(route = "TextView")

}