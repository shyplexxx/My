package com.example.myapplication.ui.theme.Screen

import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.theme.elements.AnalysisItem
import com.example.myapplication.ui.theme.elements.testAnalysisList
import com.example.myapplication.ui.theme.elements.testFilters
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

// 4 переменные внутри одного UI State
data class AnalysisUiState(
    val analysisList: List<AnalysisItem> = emptyList(), // 1. Список анализов
    val filters: List<String> = emptyList(),           // 2. Список фильтров
    val selectedFilter: String = "Популярные",          // 3. Доп: Выбранный фильтр
    val currentTab: String = "Анализы"                  // 4. Доп: Текущий таб
)

class AnalysisViewModel : ViewModel() {

    // Мутабельный поток Flow для обновления данных
    private val _uiState = MutableStateFlow(AnalysisUiState())

    // Публичный поток Flow для чтения в UI
    val uiState: StateFlow<AnalysisUiState> = _uiState.asStateFlow()

    init {
        // Инициализируем данные вашими тестовыми списками при старте
        _uiState.update { currentState ->
            currentState.copy(
                analysisList = testAnalysisList,
                filters = testFilters
            )
        }
    }

    // Изменение фильтра
    fun selectFilter(filter: String) {
        _uiState.update { it.copy(selectedFilter = filter) }
    }

    // Изменение таб-бара (на будущее)
    fun changeTab(tab: String) {
        _uiState.update { it.copy(currentTab = tab) }
    }
}
