package com.example.myapplication.ui.theme.elements

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColor

@Composable
fun OnboardHeader(modifier: Modifier = Modifier, text: String) : Unit {
    Text(
        text = text,
        color = AccentColor,
        fontSize = 20.sp,
        letterSpacing = 0.sp,
        modifier = modifier

    )

}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader(
        modifier = TODO(),
        text = TODO()
    )
}





