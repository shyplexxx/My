package com.example.myapplication.ui.theme.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.WhiteColor
import com.example.myapplication.ui.theme.elements.MainTabBar
import com.example.myapplication.ui.theme.elements.testAnalysisList
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.myapplication.ui.theme.elements.AddButton
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilterChip
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.elements.testFilters
import components.AnalysisCard




@Composable
fun AnalysisScreen(modifier: Modifier = Modifier) {
    var currentTab by remember { mutableStateOf("Анализы") }
    var selectedFilter by remember { mutableStateOf("Популярные") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            MainTabBar(
                currentRoute = currentTab,
                onTabSelected = { clickedTab -> currentTab = clickedTab }
            )
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(WhiteColor)
                .padding(innerPadding)
        ) {
            // 👑 ВЕНЕЦ ЭКРАНА: Строка фильтров, добавленная по Вашему указу
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp), // Отступы сверху от шторки и снизу до карточек
                contentPadding = PaddingValues(horizontal = 16.dp), // Отступ для крайних чипсов
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Расстояние между чипсами
            ) {
                items(testFilters) { filter ->
                    com.example.myapplication.ui.theme.elements.FilterChip(
                        text = filter,
                        isSelected = filter == selectedFilter
                    )
                }
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(testAnalysisList) { item ->
                    AnalysisCard(
                        title = item.title,
                        days = item.days,
                        price = item.price,
                        onAddClick = {},
                        modifier = Modifier.fillMaxWidth()
                    )

                }
            }
        }

    }

}



@Preview(device = "id:pixel_9_pro")
@Composable
fun AnalysisScreenPreview() {
    AnalysisScreen()
}