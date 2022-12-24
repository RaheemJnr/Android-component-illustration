package com.example.androidcomponentillustration.navigation


import MainScreen
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@ExperimentalAnimationApi
@Composable
fun MainScreenNavigation(
    navController: NavHostController,
) {
    // val mainViewModel = hiltViewModel<MainViewModel>()

    NavHost(navController, startDestination = MainScreen.ComponentListScreen.route) {
        // component list
        composable(MainScreen.ComponentListScreen.route) {
        }
        // implementation
        composable(MainScreen.ComponentImplScreen.route) {

        }
    }

}

