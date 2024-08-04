package com.example.lookatmenow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
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
            }
        }
    }
}
