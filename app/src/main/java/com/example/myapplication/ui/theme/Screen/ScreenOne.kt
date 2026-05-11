package com.example.myapplication.ui.theme.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.myapplication.ui.theme.Green
import com.example.myapplication.ui.theme.elements.Center_t
import com.example.myapplication.ui.theme.elements.Image_1
import com.example.myapplication.ui.theme.elements.Image_2
import com.example.myapplication.ui.theme.elements.Image_6
import com.example.myapplication.ui.theme.elements.link
import com.example.myapplication.ui.theme.elements.small_text

@Composable
fun Screen_one(modifier: Modifier = Modifier) {


    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Box(modifier = Modifier.fillMaxWidth()) {
                link(
                    modifier = Modifier.padding(
                        top = 49.dp,
                        start = 30.dp
                    )
                )

                Image_1(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(top = 49.dp, start = 260.dp)
                        .fillMaxWidth()

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
                    text = "Анализы"
                )

                small_text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Экспресс сбор и получение проб"
                )




            }

            Spacer(modifier = Modifier.weight(0.8f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image_6(modifier = Modifier.fillMaxWidth())
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image_2(modifier = Modifier
                    .fillMaxWidth()
                    .size(240.dp)

                )
            }

            Spacer(modifier = Modifier.weight(1f))

        }


        




    }





}

@Preview(device = "id:pixel_9_pro")
@Composable
private fun Screen_one_prev() {
    Screen_one()
}