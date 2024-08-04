package com.example.lookatmenow.views

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Sample data for visitors (replace with actual data)
data class Visitor(
    val name: String,
    val purpose: String,
    val timestamp: LocalDateTime
)

@RequiresApi(Build.VERSION_CODES.O)
val visitors = listOf(
    Visitor("John Doe", "Return Playstation", LocalDateTime.now().minusDays(2)),
    Visitor("Jane Smith", "Package delivery", LocalDateTime.now().minusHours(1)),
    Visitor("Bob Johnson", "Meeting with CEO", LocalDateTime.now().minusMinutes(30))
)

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Notifications(modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background, MaterialTheme.shapes.extraLarge),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Notifications",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(visitors) { visitor ->
                VisitorCard(visitor)
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun VisitorCard(visitor: Visitor) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp),
//            contentAlign = TextAlign.Center
        ) {
            // Load the image of this visitor using glide here (replace with actual image loading)
            Text("Image") // Replace with image loading function
        }

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = visitor.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = visitor.purpose,
                style = MaterialTheme.typography.bodySmall
            )
        }

        Text(
            text = visitor.timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun NotificationsPreview() {
    Notifications(Modifier)
}