package com.example.lookatmenow.views

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(
    modifier: Modifier
){
    Column(
        modifier
            .fillMaxSize()
//            .background(MaterialTheme.colorScheme.secondary, MaterialTheme.shapes.extraLarge)
            .padding(24.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Box(
            modifier
                .padding(16.dp)
                .aspectRatio(2f)
                .background(MaterialTheme.colorScheme.primary)
                .fillMaxWidth()
            ) {
//            Display individuals at the entrance
            Text(text = "Visitor on the door!", modifier = Modifier.align(androidx.compose.ui.Alignment.Center),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center)

        }
        Spacer(modifier = Modifier.height(8.dp) )

        LazyRow(
            modifier
                .fillMaxWidth()
                .padding(18.dp)
                .aspectRatio(2f)
                .background(MaterialTheme.colorScheme.onTertiary)) {

        }
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.tertiary, MaterialTheme.shapes.extraLarge)
                .padding(18.dp)) {

        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(Modifier)
}