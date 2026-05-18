package com.example.myapplication.ui.theme.elements

import android.content.res.Resources
import android.health.connect.datatypes.ExerciseRoute
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.PrimaryColor
import com.example.myapplication.ui.theme.SecondaryColor
import com.example.myapplication.ui.theme.TextColorDark
import com.example.myapplication.ui.theme.TextColorGray
import com.example.myapplication.ui.theme.TextColorGray2
import com.example.myapplication.ui.theme.WhiteColor

data class TabItem(val title: String, val iconRes: Int)

@Composable
fun MainTabBar(
    currentRoute: String,
    onTabSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        TabItem("Анализы", R.drawable.one),
        TabItem("Результаты", R.drawable.two),
        TabItem("Поддержка", R.drawable.three),
        TabItem("Профиль", R.drawable.four)
    )

    NavigationBar(
        containerColor = WhiteColor,
        tonalElevation = 8.dp,
        modifier = modifier
    ) {
        items.forEach { item ->
            val isSelected = currentRoute == item.title
            NavigationBarItem(
                selected = isSelected,
                onClick = { onTabSelected(item.title) },
                label = {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.bodySmall,
                    )
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconRes),
                        contentDescription = item.title,
                        modifier = Modifier.size(24.dp)
                    )
                },

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = PrimaryColor,
                    selectedTextColor = PrimaryColor,
                    unselectedIconColor = TextColorGray,
                    unselectedTextColor = TextColorGray2,
                    indicatorColor = WhiteColor
                )
            )
        }
    }

}

@Preview(showBackground = true, name = "Нижнее меню")
@Composable
fun MainTabBarPreview() {
    MainTabBar(
        currentRoute = "Анализы",
        onTabSelected = {}
    )
}