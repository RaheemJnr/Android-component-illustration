package com.example.androidcomponentillustration.navigation

sealed class MainScreen(
    val route: String,
) {
    object ComponentList : MainScreen(route = "Component List")

    object ComponentImpl :
        MainScreen(route = "Component Impl")

}


sealed class Destination(
    val route: String
) {
    object TextField : Destination(route = "TextField")
    object Animation : Destination(route = "Animation")
 //   object TextView : Destination(route = "TextView")

}