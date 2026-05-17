package com.example.myapplication.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Blue = Color(0xFF57A9FF)

val Green = Color(0xFF00B712)

val Gray = Color(0xFF939396)



var PrimaryColor = Color(0xFF0560FA)
var SecondaryColor = Color(0xFFEC8000)

var SuccessColor = Color(0xFF35B369)
var WarningColor = Color(0xFFEBBC2E)
var InfoColor = Color(0xFF2F80ED)
var ErrorColor = Color(0xFFED3A3A)

var TextColorDark = Color(0xFF3A3A3A)
var TextColorBlack = Color(0xFF141414)

var TextColorGray = Color(0xFFCFCFCF)
var TextColorGray2 = Color(0xFFA7A7A7)

var WhiteColor = Color(0xFFFFFFFF)

@Immutable
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val textblack: Color,
    val textDark: Color,
    val textgrey: Color,
    val textgrey2: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        textblack = Color.Unspecified,
        textDark = Color.Unspecified,
        textgrey = Color.Unspecified,
        textgrey2 = Color.Unspecified
    )
}

