package components

import android.content.res.Resources
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.TextColorDark
import com.example.myapplication.ui.theme.TextColorGray2
import com.example.myapplication.ui.theme.WhiteColor
import com.example.myapplication.ui.theme.elements.AddButton






@Composable
fun AnalysisCard(
    title: String,
    days: String,
    price: String,
    onAddClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                color = TextColorDark,
                
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column {
                    Text(
                        text = days,
                        style = MaterialTheme.typography.bodyMedium,
                        color = TextColorGray2,
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = price,
                        style = MaterialTheme.typography.titleLarge,
                        color = TextColorDark,

                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                AddButton(
                    onClick = onAddClick,
                    modifier = Modifier.offset(y = 6.dp)
                )
            }
        }
    }
}

@Preview(
)
@Composable
fun AnalysisCardPreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(vertical = 16.dp)
    ) {

        AnalysisCard(
            title = "Общий анализ крови",
            days = "2 дня",
            price = "1 500 ₽",
            onAddClick = {}
        )

        AnalysisCard(
            title = "Биохимический анализ",
            days = "1 день",
            price = "2 300 ₽",
            onAddClick = {}
        )
    }
}

