package com.example.lookatmenow.domain

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val hasNotification: Boolean,
    val badgeCount: Int? = null
)