package com.example.myapplication.ui.theme

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.elements.Button
import com.example.myapplication.ui.theme.elements.OutlinetextField
import com.example.myapplication.ui.theme.elements.PrimaryButton
import com.example.myapplication.ui.theme.elements.Textbot
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun ScrenLogin(modifier: Modifier = Modifier) {
    var emailText by remember { mutableStateOf("") }
    var flagEmail = emailText.trim().isNotEmpty()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Добро пожаловать!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp, bottom = 8.dp)
        )

        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 16.sp,
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.weight(0.5f))

        OutlinetextField(modifier = Modifier.fillMaxWidth(), value = emailText, onValueChange = {emailText = it}, label = "Вход по E-mail", placeholder = "example@mail.ru")

        Spacer(modifier = Modifier.height(16.dp))

        PrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { Log.d("APP_LOG", "email: $emailText")},
            text = "Далее",
            enabled = flagEmail

        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Или войдите с помощью",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Gray,
            modifier = Modifier.padding(bottom = 15.dp)
        )

        Button(modifier = Modifier.fillMaxWidth(), onClick = {}, text = "Войти c Яндекс")





    }
}

@Preview(device = "id:pixel_xl")
@Composable
private fun ScreenLoginPrev() {
    ScrenLogin()
}