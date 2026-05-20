package com.example.myapplication.ui.theme.elements

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Gray

@Composable
fun Textbot(modifier: Modifier = Modifier) {
    Text(
        text = "Или войдите с помощью",
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        color = Gray,
        modifier = Modifier.padding(bottom = 152.dp)
    )
}