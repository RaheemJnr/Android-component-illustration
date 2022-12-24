sealed class MainScreen(
    val route: String,
    val title: String,
) {
    object ComponentList : MainScreen(route = "Component List", title = "Component List")

    object ComponentImpl :
        MainScreen(route = "Component Impl", title = "Component Implementation")

}