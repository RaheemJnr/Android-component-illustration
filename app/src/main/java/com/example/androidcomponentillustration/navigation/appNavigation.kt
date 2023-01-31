package com.example.androidcomponentillustration.navigation


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.androidcomponentillustration.ui.screen.impl.ComponentImplScreen
import com.example.androidcomponentillustration.ui.screen.list.ComponentListScreen
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@ExperimentalAnimationApi
@Composable
fun MainScreenNavigation(
    navController: NavHostController,
) {

    NavHost(navController, startDestination = MainScreen.ComponentList.route) {
        // component list
        composable(MainScreen.ComponentList.route) {
            ComponentListScreen(navController = navController)
        }

        // implementation
        composable(
            route = "componentImpl/{screenType}",
            arguments = listOf(navArgument("screenType") { defaultValue = "TextView" })
        ) {
            ComponentImplScreen(
                screenType = it.arguments?.getString("screenType") ?: "TextView"
            )
        }
    }

}

