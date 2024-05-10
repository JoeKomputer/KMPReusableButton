package com.common.ui_sdk.theme

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt

interface ComposeUISDKColor {
    val layoutSurface: Color
    val layoutSurfaceHigh: Color
    val fillCTAPrimary: Color
    val textCTAPrimary: Color
    val borderCTAPrimary : Color
    companion object {

        val default: ComposeUISDKColor by lazy(mode = LazyThreadSafetyMode.NONE) { default() }

        fun default(
            layoutSurface: Color = Color.Unspecified,
            layoutSurfaceHigh: Color = Color.Unspecified,
            fillCTAPrimary: Color = Color.Unspecified,
            textCTAPrimary: Color = Color.Unspecified,
            borderCTAPrimary: Color = Color.Unspecified
        ): ComposeUISDKColor = object : ComposeUISDKColor {
            override val layoutSurface: Color
                get() = layoutSurface
            override val layoutSurfaceHigh: Color
                get() = layoutSurfaceHigh
            override val fillCTAPrimary: Color
                get() = fillCTAPrimary
            override val textCTAPrimary: Color
                get() = textCTAPrimary
            override val borderCTAPrimary: Color
                get() = borderCTAPrimary
        }

        fun dark(
            layoutSurface: Color = Color.DarkGray,
            layoutSurfaceHigh: Color = Color.Gray,
            fillCTAPrimary: Color = Color.LightGray,
            textCTAPrimary: Color = Color("#0000a3".toColorInt()),
            borderCTAPrimary: Color = Color.White
        ): ComposeUISDKColor = object : ComposeUISDKColor {
            override val layoutSurface: Color
                get() = layoutSurface
            override val layoutSurfaceHigh: Color
                get() = layoutSurfaceHigh
            override val fillCTAPrimary: Color
                get() = fillCTAPrimary
            override val textCTAPrimary: Color
                get() = textCTAPrimary
            override val borderCTAPrimary: Color
                get() = borderCTAPrimary
        }

        fun light(
            layoutSurface: Color = Color.White,
            layoutSurfaceHigh: Color = Color.Gray,
            fillCTAPrimary: Color = Color.White,
            textCTAPrimary: Color = Color("#0000f5".toColorInt()),
            borderCTAPrimary: Color = Color.LightGray
        ): ComposeUISDKColor = object : ComposeUISDKColor {
            override val layoutSurface: Color
                get() = layoutSurface
            override val layoutSurfaceHigh: Color
                get() = layoutSurfaceHigh
            override val fillCTAPrimary: Color
                get() = fillCTAPrimary
            override val textCTAPrimary: Color
                get() = textCTAPrimary
            override val borderCTAPrimary: Color
                get() = borderCTAPrimary
        }
    }
}

@Composable
fun ComposeUISDKColor.textButtonColors(
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = UISDKTheme.colors.textCTAPrimary
): ButtonColors = ButtonDefaults.buttonColors(
    backgroundColor = backgroundColor,
    contentColor = contentColor
)

@Composable
fun ComposeUISDKColor.buttonColors(
    backgroundColor: Color = UISDKTheme.colors.fillCTAPrimary,
    contentColor: Color = UISDKTheme.colors.textCTAPrimary
): ButtonColors = ButtonDefaults.buttonColors(
    backgroundColor = backgroundColor,
    contentColor = contentColor
)

@Composable
fun ComposeUISDKColor.outlineButtonColors(
    backgroundColor: Color = UISDKTheme.colors.fillCTAPrimary,
    contentColor: Color = UISDKTheme.colors.textCTAPrimary
): ButtonColors = ButtonDefaults.buttonColors(
    backgroundColor = backgroundColor,
    contentColor = contentColor
)