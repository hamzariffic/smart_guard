package com.example.lookatmenow.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeScreen(
    modifier: Modifier,
    navHostController: NavHostController
){
    Column(
        modifier
            .fillMaxSize()
            .background(colorScheme.secondary, MaterialTheme.shapes.extraLarge)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier
                .padding(18.dp)
                .aspectRatio(1f)
                .background(colorScheme.onTertiary, MaterialTheme.shapes.extraLarge)
                .fillMaxWidth()
        ) {
    //            Display individuals at the entrance
            Text(text = "Visitor on the door!", modifier = Modifier.align(Alignment.Center),
                textAlign = TextAlign.Center,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,)

        }
        Spacer(modifier = Modifier.height(8.dp) )

        LazyRow(
            modifier
                .fillMaxWidth()
                .padding(18.dp)
                .aspectRatio(4f)
                .background(colorScheme.tertiary, MaterialTheme.shapes.extraLarge)) {
            @Composable
            fun FilledTonalButtonExample(onClick: () -> Unit) {
                FilledTonalButton(onClick = { onClick() }) {
                    Text("Tonal")
                }
            }

        }
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(colorScheme.tertiary, MaterialTheme.shapes.extraLarge)
                .padding(18.dp)) {

        }
    }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(Modifier, navHostController = rememberNavController())
}