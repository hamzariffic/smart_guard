package com.example.lookatmenow.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

// Sealed Class containing all the screens in this application
//They are basically data objects, with names, and have an argument for the route as strings in the brackets
//For this to work, we need a navController initiated including in the Main activity
sealed class Screen(val route: String) {
    data object HomeScreen: Screen("home_screen")
    data object SplashScreen: Screen("splash_screen")
    data object Notifications: Screen("notifications_screen")
    data object Profile: Screen("profile_screen")
}

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object HomeScreen : BottomNavItem("home", Icons.Default.Home, "Home")
    data object Notifications : BottomNavItem("notifications", Icons.Default.Notifications, "Search")
    data object Profile : BottomNavItem("profile", Icons.Default.Person, "Profile")
}