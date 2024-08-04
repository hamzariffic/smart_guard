package com.example.lookatmenow.domain

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.lookatmenow.views.Visitor
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
val visitors = listOf(
    Visitor("John Doe", "Return Playstation", LocalDateTime.now().minusDays(2)),
    Visitor("Jane Smith", "Package delivery", LocalDateTime.now().minusHours(1)),
    Visitor("Bob Johnson", "Meeting with CEO", LocalDateTime.now().minusMinutes(30)),
    Visitor("Hamza Matea", "Checking a laptop machine", LocalDateTime.now().minusDays(1))
)