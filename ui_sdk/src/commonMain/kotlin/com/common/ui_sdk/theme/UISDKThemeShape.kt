package com.common.ui_sdk.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

object UISDKShapeRadius {
    val Standard = 8.dp
}

interface UISDKThemeShape {

    val buttonShape: Shape

    companion object {

        val default: UISDKThemeShape by lazy(mode = LazyThreadSafetyMode.NONE) { default() }

        fun default(
            buttonShape: Shape = RoundedCornerShape(UISDKShapeRadius.Standard),
        ): UISDKThemeShape = UISDKThemeShapeData(
            buttonShape = buttonShape
        )
    }
}

private data class UISDKThemeShapeData(
    override val buttonShape: Shape
) : UISDKThemeShape