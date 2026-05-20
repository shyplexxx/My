package com.example.myapplication.ui.theme.elements

import android.R
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColor
import com.example.myapplication.ui.theme.ButtonColorText
import com.example.myapplication.ui.theme.PrimaryButtonColor
import com.example.myapplication.ui.theme.PrimaryColor
import com.example.myapplication.ui.theme.Unactive
import com.example.myapplication.ui.theme.WhiteColor
import kotlin.math.sign

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 18.dp),

        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor, contentColor = WhiteColor,
            Unactive, ButtonColorText
        ),
        enabled = enabled
    ) {
        Text(text = text, color = ButtonColorText, style = TextStyle (fontSize = 17.sp), lineHeight = 24.sp, fontWeight = FontWeight(600))
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(onClick = {}, text = "Далее", enabled = true);
}