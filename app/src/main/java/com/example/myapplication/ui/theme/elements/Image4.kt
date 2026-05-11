package com.example.myapplication.ui.theme.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Image_4(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = com.example.myapplication.R.drawable.img3),
        contentDescription = "",
        modifier = modifier
    )
}

@Preview
@Composable
private fun Image_4_prev() {
    Image_4()
}