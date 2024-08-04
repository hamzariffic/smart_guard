package com.example.lookatmenow.navigation

// Sealed Class containing all the screens in this application
//They are basically data objects, with names, and have an argument for the route as strings in the brackets
//For this to work, we need a navController initiated including in the Main actiity
sealed class Screen(val route: String) {
    data object HomeScreen: Screen("home_screen")
    data object SplashScreen: Screen("splash_screen")
}