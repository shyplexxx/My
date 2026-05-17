package com.example.myapplication.ui.theme.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.PrimaryColor
import com.example.myapplication.ui.theme.TextColorDark
import com.example.myapplication.ui.theme.TextColorGray
import com.example.myapplication.ui.theme.TextColorGray2

@Composable
fun FilterChip(
    text: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(12.dp)) // Скругление, как на Вашем холсте, милорд
            // Если выбран — подставляем нежно-лиловый/голубой, если нет — светло-серый (TextColorGray2)
            .background(if (isSelected) TextColorGray else TextColorGray)
            .padding(horizontal = 20.dp, vertical = 14.dp) // Внутренние покои чипса
    ) {
        Text(
            text = text,
            // Если выбран — цвет кнопок (PrimaryColor), если нет — темный текст (TextColorDark)
            color = if (isSelected) TextColorGray2 else TextColorGray2,
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true, name = "Чипс Выбран")
@Composable
fun FilterChipSelectedPreview() {
    FilterChip(text = "Популярные", isSelected = true)
}

@Preview(showBackground = true, name = "Чипс Не Выбран")
@Composable
fun FilterChipUnselectedPreview() {
    FilterChip(text = "Covid", isSelected = false)
}