package com.example.myapplication.ui.theme.elements

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Gray

@Composable
fun small_text(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Gray,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp,
        modifier = modifier,
        textAlign = TextAlign.Center

    )
}

@Preview
@Composable
private fun small_text_prev() {
    small_text(text = "Xtttt")
}