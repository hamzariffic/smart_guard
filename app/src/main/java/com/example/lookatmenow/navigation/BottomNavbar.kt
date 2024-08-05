package com.example.lookatmenow.navigation

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lookatmenow.domain.BottomNavItem


//Bottom AppBar for navigating between three screens
//Profile, Notifications, and HomeScreen with notification badges.
//This will require defining components like BottomNavItem and BottomAppBar
//

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomAppBar(navController: NavHostController) {
    Scaffold {
        var bottomBar = @androidx.compose.runtime.Composable {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = index == 0,
                        onClick = { navController.navigate(item.name) },
                        icon = {
                            if (item.hasNotification) {
                                BadgedBox(
                                    badge = {
                                        if (item.badgeCount != null) {
                                            Badge { Text(item.badgeCount.toString()) }
                                        }
                                    }
                                ) {
                                    Icon(item.selectedIcon, contentDescription = item.name)
                                }
                            }
                        })
                }
            }
        }
    }
}


val items = listOf(
    BottomNavItem(
        name = "Home",
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home,
        hasNotification = false
    ),
    BottomNavItem(
        name = "Notifications",
        selectedIcon = Icons.Filled.Notifications,
        unSelectedIcon = Icons.Outlined.Notifications,
        hasNotification = false
    ),
    BottomNavItem(
        name = "Profile",
        selectedIcon = Icons.Filled.Person,
        unSelectedIcon = Icons.Outlined.Person,
        hasNotification = false
    )
)

@Preview(showBackground = true)
@Composable
fun BottomAppBar(modifier: Modifier = Modifier) {
    BottomAppBar(rememberNavController())
}
