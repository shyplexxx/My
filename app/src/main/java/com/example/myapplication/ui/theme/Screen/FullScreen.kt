package com.example.myapplication.ui.theme.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
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
import com.example.myapplication.ui.theme.elements.Image_7
import com.example.myapplication.ui.theme.elements.Image_8
import com.example.myapplication.ui.theme.elements.link
import com.example.myapplication.ui.theme.elements.small_text

@Composable
fun FullScreen(
    title: String,
    subtitle: String,
    loadImage: @Composable (Modifier) -> Unit,
    bigImage: @Composable (Modifier) -> Unit,
    modifier: Modifier = Modifier

) {
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
                    text = title


                )

                small_text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = subtitle



                )




            }

            Spacer(modifier = Modifier.weight(0.8f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                loadImage(Modifier.fillMaxWidth())
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                bigImage(Modifier
                    .fillMaxWidth()
                    .size(300.dp)

                )
            }

            Spacer(modifier = Modifier.weight(0.8f))

        }
    }

}

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    FullScreen(
        title = "Анализы",
        subtitle = "Экспресс сбор и получение проб",
        bigImage = {modifier -> Image_2(modifier) },
        loadImage = {modifier -> Image_6(modifier) }
    )
}

@Composable
fun SecondScreen(modifier: Modifier = Modifier) {
    FullScreen(
        title = "Уведомления",
        subtitle = "Вы быстро узнаете о результатах",
        bigImage = {modifier -> Image_3(modifier) },
        loadImage = {modifier -> Image_7(modifier) }
    )
}

@Composable
fun ThirdScreen(modifier: Modifier = Modifier) {
    FullScreen(
        title = "Мониторинг",
        subtitle = "Наши врачи всегда наблюдают \n" +
                "за вашими показателями здоровья",
        bigImage = {modifier -> Image_4(modifier) },
        loadImage = {modifier -> Image_8(modifier) }
    )
}



@Preview
@Composable
private fun FullScrenPrev() {
    // FirstScreen()
    // SecondScreen()
     ThirdScreen()
}