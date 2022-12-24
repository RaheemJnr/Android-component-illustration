package com.example.androidcomponentillustration.navigation


import MainScreen
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
    // val mainViewModel = hiltViewModel<MainViewModel>()

    NavHost(navController, startDestination = MainScreen.ComponentList.route) {
        // component list
        composable(MainScreen.ComponentList.route) {
            ComponentListScreen()
        }

        // implementation
        composable(MainScreen.ComponentImpl.route) {

        }
    }

}

