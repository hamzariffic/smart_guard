package com.example.lookatmenow.views

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lookatmenow.R

@Composable
fun SplashScreen(modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize()
        .background(
            colorScheme.onTertiary, MaterialTheme.shapes.extraLarge
        ),
        contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.smhg),
            contentDescription = "Welcome to SmartHome Guard",
            modifier = modifier.fillMaxSize(0.7f).background(
                color = colorScheme.onTertiary,
                shape = MaterialTheme.shapes.extraLarge
            ),
            contentScale = ContentScale.Fit
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(Modifier)
}