package com.example.myapplication.ui.theme.Screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.PrimaryColor
import com.example.myapplication.ui.theme.WhiteColor
import com.example.myapplication.ui.theme.elements.MainTabBar

@Composable
fun TabScreen(modifier: Modifier = Modifier) {
    var currentTab by remember { mutableStateOf("Анализы") }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = WhiteColor,
        bottomBar = {
            MainTabBar(
                currentRoute = currentTab,
                onTabSelected = { selectedTitle -> currentTab = selectedTitle }
            )
        }
    ){ innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center,

        ) {
            Text(
                text = currentTab,
                style = MaterialTheme.typography.headlineLarge,
                color = PrimaryColor

            )
        }

    }
}

@Preview
@Composable
private fun TabScreenPrev() {
    TabScreen()

}