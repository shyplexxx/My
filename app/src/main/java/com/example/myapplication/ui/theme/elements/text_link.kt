package com.example.myapplication.ui.theme.elements

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Blue

@Composable
fun link(modifier: Modifier = Modifier) {
    Text(
        text = "Далее",
        fontSize = 20.sp,
        fontWeight = FontWeight.W600,
        color = Blue,
        modifier = modifier
    )
}

@Preview
@Composable
private fun linkPrev () {
    link()
}