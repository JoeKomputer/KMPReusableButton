package com.common.ui_sdk.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface UISDKThemeDimension {

    val buttonPadding: PaddingValues
    val buttonBorderStrokeWidth : Dp
    val buttonMinHeight : Dp

    companion object {

        val default: UISDKThemeDimension by lazy(mode = LazyThreadSafetyMode.NONE) { default() }

        fun default(
            buttonPadding: PaddingValues = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
            buttonBorderStrokeWidth : Dp = 2.dp,
            buttonMinHeight : Dp = 24.dp
        ): UISDKThemeDimension = UISDKThemeDimensionData(
            buttonPadding = buttonPadding,
            buttonBorderStrokeWidth = buttonBorderStrokeWidth,
            buttonMinHeight = buttonMinHeight
        )
    }
}

private data class UISDKThemeDimensionData(
    override val buttonPadding: PaddingValues,
    override val buttonBorderStrokeWidth: Dp,
    override val buttonMinHeight : Dp
) : UISDKThemeDimension