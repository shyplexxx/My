package com.example.myapplication.ui.theme.elements

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun Image_6(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.group_2),
        contentDescription = "",
        modifier = modifier
    )
}


@Preview
@Composable
private fun Image_6_prev() {
    Image_6()
}