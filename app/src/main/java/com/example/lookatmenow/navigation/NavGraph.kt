package com.example.lookatmenow.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lookatmenow.views.HomeScreen
import com.example.lookatmenow.views.SplashScreen

@Composable
fun SetupNavGraph(modifier: Modifier = Modifier,
                  navController: NavHostController,
                  startDestination: String = Screen.SplashScreen.route
) {
    NavHost(navController = navController,
        startDestination = startDestination)
    {
        composable(Screen.SplashScreen.route) {
            SplashScreen(
                modifier = Modifier,
                onSplashComplete = {
                    navController.navigate(Screen.HomeScreen.route) {
                        popUpTo(Screen.SplashScreen.route) { inclusive = true }
                    }
                }
            )
        }
        composable(Screen.HomeScreen.route) {
            HomeScreen(
                modifier = Modifier,
                navHostController = navController
            )
        }

    }

}