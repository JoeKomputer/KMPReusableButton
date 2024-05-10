package com.common.ui_sdk.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

interface UISDKThemeTypography {

    val button: TextStyle

    companion object {

        val default: UISDKThemeTypography by lazy(mode = LazyThreadSafetyMode.NONE) { default() }

        fun default(
            button: TextStyle = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 20.sp
            ),
        ): UISDKThemeTypography = UISDKThemeTypographyData(
            button = button
        )
    }
}

private data class UISDKThemeTypographyData(
    override val button: TextStyle
) : UISDKThemeTypography