sealed class MainScreen(
    val route: String,
    val title: String,
) {
    object ComponentListScreen : MainScreen(route = "Component List", title = "Component List")

    object ComponentImplScreen :
        MainScreen(route = "Component Impl", title = "Component Implementation")

}