package com.example.lookatmenow.navigation

// Sealed Class containing all the screens in this application
//They are basically data objects, with names, and have an argument for the route as strings in the brackets
//For this to work, we need a navController initiated including in the Main activity
sealed class Screen(val route: String) {
    data object HomeScreen: Screen("home_screen")
    data object SplashScreen: Screen("splash_screen")
    data object Notifications: Screen("notifications_screen")
    data object Settings : Screen("settings_screen")
}

data class ScreenRoute(val route: String)
