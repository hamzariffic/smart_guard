package com.example.lookatmenow.views.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LogOut(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(12.dp)
            .background(color = MaterialTheme.colorScheme.primaryContainer)) {
        Row(
            modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(6.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            OutlinedButton(onClick = {
                logOut()
            }) {

            }
        }
    }
}

fun logOut() {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun LogOutPreview(modifier: Modifier = Modifier) {
    LogOut()
}