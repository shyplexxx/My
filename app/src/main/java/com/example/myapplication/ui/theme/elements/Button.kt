package com.example.myapplication.ui.theme.elements

import android.graphics.Outline
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ButtonColorText
import com.example.myapplication.ui.theme.PrimaryButtonColor
import com.example.myapplication.ui.theme.transp

@Composable
fun Button(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedButton (
        onClick = onClick,
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 20.dp),

        border = BorderStroke(
            width = 2.dp,
            color = PrimaryButtonColor

        ),

        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.outlinedButtonColors(transp, PrimaryButtonColor)
    ) {
        Text(text = text, color = PrimaryButtonColor, style = TextStyle (fontSize = 16.sp))
    }
}

@Preview
@Composable
private fun ButtonPreview() {
    Button(onClick = {}, text = "Войти");
}