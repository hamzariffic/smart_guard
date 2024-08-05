package com.example.lookatmenow.navigation

import BottomBar
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.lookatmenow.views.HomeScreen
import com.example.lookatmenow.views.Notifications
import com.example.lookatmenow.views.Settings
import com.example.lookatmenow.views.SplashScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SetupNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Screen.SplashScreen.route
) {
    Scaffold(
        bottomBar = {
            if (navController.currentBackStackEntryAsState().value?.destination?.route != Screen.SplashScreen.route) {
                BottomBar(navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(innerPadding)
        ) {
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
            composable(Screen.Notifications.route) {
                Notifications(modifier = Modifier)
            }
            composable(Screen.Settings.route) {
                Settings(modifier = Modifier)
            }
        }
    }
}