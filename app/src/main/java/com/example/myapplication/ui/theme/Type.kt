package com.example.myapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)


@Immutable
data class AppTypography(
    val displayLarge: TextStyle,
    val displayMedium: TextStyle,
    val displaySmall: TextStyle,
    val headlineLarge: TextStyle,
    val headlineMedium: TextStyle,
    val headlineSmall: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle

)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        displayLarge = androidx.compose.ui.text.TextStyle.Default,
        displayMedium = androidx.compose.ui.text.TextStyle.Default,
        displaySmall = androidx.compose.ui.text.TextStyle.Default,
        headlineLarge = androidx.compose.ui.text.TextStyle.Default,
        headlineMedium = androidx.compose.ui.text.TextStyle.Default,
        headlineSmall = androidx.compose.ui.text.TextStyle.Default,
        titleLarge = androidx.compose.ui.text.TextStyle.Default,
        titleMedium = androidx.compose.ui.text.TextStyle.Default,
        titleSmall = androidx.compose.ui.text.TextStyle.Default,
        bodyLarge = androidx.compose.ui.text.TextStyle.Default,
        bodyMedium = androidx.compose.ui.text.TextStyle.Default,
        bodySmall = androidx.compose.ui.text.TextStyle.Default
    )
}