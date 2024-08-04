package com.example.lookatmenow

import android.app.Notification
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.example.lookatmenow.navigation.BottomNavItem
import com.example.lookatmenow.navigation.Screen
import com.example.lookatmenow.navigation.SetupNavGraph
import com.example.lookatmenow.ui.theme.LookAtMeNowTheme
import com.example.lookatmenow.views.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // splash screen
        installSplashScreen()
//Here we're declaring the navController as a type of NavHostController
        lateinit var navController: NavHostController
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            LookAtMeNowTheme {
//                This is where we're passing the navController to the HomeScreen and it'll help in the navigation
//               We also call the SetupNavGraph function here since it will help us in the navigation
                navController = rememberNavController()
                SetupNavGraph(navController = navController)

//                val items = listOf(
//                    BottomNavItem(
//                        name = "Home",
//                        selectedIcon = Icons.Filled.Home,
//                        unSelectedIcon = Icons.Outlined.Home,
//                        hasNotification = false
//                    ),
//                    BottomNavItem(
//                        name = "Notifications",
//                        selectedIcon = Icons.Filled.Notifications,
//                        unSelectedIcon = Icons.Outlined.Notifications,
//                        hasNotification = false
//                    ),
//                    BottomNavItem(
//                        name = "Profile",
//                        selectedIcon = Icons.Filled.Person,
//                        unSelectedIcon = Icons.Outlined.Person,
//                        hasNotification = false
//                    )
//                )
//
//                Scaffold {
//                    bottomBar = {
//                        NavigationBar{
//                            items.forEachIndexed() { index, item ->
//                                NavigationBarItem(
//                                    selected = index == 0,
//                                    onClick = { navController.navigate(item.name) },
//                                    icon = {
//                                        if (item.hasNotification) {
//                                            BadgedBox(
//                                                badge = {
//                                                    if (item.badgeCount != null) {
//                                                        Badge { Text(item.badgeCount.toString()) }
//                                                    }
//                                                }
//                                            ) {
//                                                Icon(item.selectedIcon, contentDescription = item.name)
//                        }
//                    }
//                }
//            }
            }
        }
    }
}

//data class BottomNavItem(
//    val name: String,
//    val selectedIcon: ImageVector,
//    val unSelectedIcon: ImageVector,
//    val hasNotification: Boolean,
//    val badgeCount: Int? = null
//)