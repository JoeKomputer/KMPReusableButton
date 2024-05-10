package com.common.ui_sdk.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

internal val LocalUISDKColor = staticCompositionLocalOf { ComposeUISDKColor.default }
internal val LocalUISDKShapes = staticCompositionLocalOf { UISDKThemeShape.default }
internal val LocalUISDKTypography = staticCompositionLocalOf { UISDKThemeTypography.default }
internal val LocalUISDKDimension = staticCompositionLocalOf { UISDKThemeDimension.default }

object UISDKTheme {
    val colors: ComposeUISDKColor
        @Composable
        @ReadOnlyComposable
        get() = LocalUISDKColor.current

    val shapes: UISDKThemeShape
        @ReadOnlyComposable
        @Composable
        get() = LocalUISDKShapes.current

    val typography: UISDKThemeTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalUISDKTypography.current

    val dimension: UISDKThemeDimension
        @ReadOnlyComposable
        @Composable
        get() = LocalUISDKDimension.current

    var isDarkModeSupported: Boolean = true
}

@Composable
fun UISDKTheme(
    color: ComposeUISDKColor = if (isSystemInDarkTheme() && UISDKTheme.isDarkModeSupported) {
        ComposeUISDKColor.dark()
    } else {
        ComposeUISDKColor.light()
    },
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalUISDKColor provides color
    ) {
        MaterialTheme(
            content = content
        )
    }
}



