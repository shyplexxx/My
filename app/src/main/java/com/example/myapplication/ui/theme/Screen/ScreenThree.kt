package com.example.myapplication.ui.theme.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.elements.Center_t
import com.example.myapplication.ui.theme.elements.Image_1
import com.example.myapplication.ui.theme.elements.Image_2
import com.example.myapplication.ui.theme.elements.Image_3
import com.example.myapplication.ui.theme.elements.Image_4
import com.example.myapplication.ui.theme.elements.Image_6
import com.example.myapplication.ui.theme.elements.Image_8
import com.example.myapplication.ui.theme.elements.link
import com.example.myapplication.ui.theme.elements.small_text

@Composable
fun Screen_Two(modifier: Modifier = Modifier) {


    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

           Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement =  Arrangement.SpaceBetween) {
                link(
                    modifier = Modifier.padding(
                        top = 49.dp,
                        start = 30.dp
                    )
                )

                Image_1(
                    modifier = Modifier
                        .padding(top = 49.dp)

                )
            }

            Spacer(modifier = Modifier.weight(0.5f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),


                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Center_t(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 23.dp),
                    text = "Мониторинг"


                )

                small_text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Наши врачи всегда наблюдают \n" +
                            "за вашими показателями здоровья"



                )




            }

            Spacer(modifier = Modifier.weight(0.8f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image_8(modifier = Modifier.fillMaxWidth())
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image_4(modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp)

                )
            }

            Spacer(modifier = Modifier.weight(0.8f))

        }







    }



}

@Preview
@Composable
private fun Screen_Two_prev() {
    Screen_Two()
}