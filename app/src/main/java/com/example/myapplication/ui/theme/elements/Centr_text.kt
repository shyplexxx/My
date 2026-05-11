package com.example.myapplication.ui.theme.elements

import android.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Green
import org.w3c.dom.Text

@Composable
fun Center_t(text: String, modifier: Modifier = Modifier) {
    Text(

        color = Green,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = modifier,
        text = text

    )
}

@Preview
@Composable
private fun Center_t_prev() {
    Center_t(text = "Анализы")
}