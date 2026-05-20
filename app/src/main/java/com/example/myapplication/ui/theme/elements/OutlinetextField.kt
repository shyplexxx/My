package com.example.myapplication.ui.theme.elements

import android.R
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Gray
import com.example.myapplication.ui.theme.oulinne
import com.example.myapplication.ui.theme.unactivetext

@Composable
fun OutlinetextField(value: String, onValueChange: (String) -> Unit, label: String, placeholder: String,   modifier: Modifier = Modifier)
{
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text =  label,
            fontSize = 14.sp,
            color = Gray,
            modifier = Modifier.padding(bottom = 8.dp)

        )

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,

            placeholder = {
                Text(text = placeholder, color = Gray, fontSize = 15.sp, lineHeight = 20.sp)
            },


            modifier = modifier.fillMaxWidth(),



            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = oulinne, unfocusedBorderColor = unactivetext, focusedContainerColor = unactivetext, unfocusedContainerColor = oulinne),










            )
    }
}

@Preview
@Composable
private fun OutlinetextFieldPrev() {
    OutlinetextField(value = "", onValueChange = {}, label = "Вход по E-mail", placeholder = "example@mail.ru")
}