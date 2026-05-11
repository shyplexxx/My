package com.example.myapplication.ui.theme.elements

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun Image_7(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.g3),
        contentDescription = "",
        modifier = modifier
    )
}


@Preview
@Composable
private fun Image_7_prev() {
    Image_7()
}