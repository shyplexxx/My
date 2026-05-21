package com.example.myapplication.ui.theme.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.theme.WhiteColor
import com.example.myapplication.ui.theme.elements.FilterChip
import com.example.myapplication.ui.theme.elements.MainTabBar
import components.AnalysisCard

@Composable
fun AnalysisScreen(
    modifier: Modifier = Modifier,
    vm: AnalysisViewModel = viewModel()
) {
    val state by vm.uiState.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = WhiteColor
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                MainTabBar(
                    currentRoute = state.currentTab,
                    onTabSelected = { clickedTab -> vm.changeTab(clickedTab) }
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(WhiteColor)
                    .padding(innerPadding)
            ) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(state.filters) { filter ->
                        FilterChip(
                            text = filter,
                            isSelected = filter == state.selectedFilter,
                            modifier = Modifier.clickable {
                                vm.selectFilter(filter)
                            }
                        )
                    }
                }

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(state.analysisList) { item ->
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
}

@Preview(device = "id:pixel_9_pro")
@Composable
fun AnalysisScreenPreview() {
    AnalysisScreen()
}
