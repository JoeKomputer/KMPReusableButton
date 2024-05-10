package com.common.ui_sdk.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.common.ui_sdk.theme.UISDKTheme
import com.common.ui_sdk.theme.buttonColors
import com.common.ui_sdk.theme.outlineButtonColors
import com.common.ui_sdk.theme.textButtonColors

/**
 * Text buttons are typically used for less-pronounced actions, including those located in dialogs
 * and cards. In cards, text buttons help maintain an emphasis on card content.
 *
 * @sample com.common.ui_sdk.samples.UISDKTextButtonSample
 * @param text text String that will be displayed inside button.
 * @param textStyle TextStyle can be passed in to change default styling of the button's text.
 * See [UISDKTheme.typography]
 * @param modifier Modifier to be applied to the button
 * @param enabled Controls the enabled state of the button. When `false`, this button will not
 * be clickable
 * @param shape Defines the button's shape as well as its shadow. See [UISDKTheme.shapes]
 * @param border Border to draw around the button. See [UISDKTheme.dimension]
 * @param colors [ButtonColors] that will be used to resolve the background and content color for
 * this button in different states. See [UISDKTheme.colors].
 * @param contentPadding The spacing values to apply internally between the container and the content.
 * See [UISDKTheme.dimension]
 * @param elevation [ButtonElevation] used to resolve the elevation for this button in different
 * states. An OutlinedButton typically has no elevation, see [Button] for a button with elevation.
 * @param onClick Will be called when the user clicks the button
 */
@Composable
fun UISDKTextButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String,
    textStyle: TextStyle = UISDKTheme.typography.button,
    shape: Shape = UISDKTheme.shapes.buttonShape,
    colors: ButtonColors = UISDKTheme.colors.textButtonColors(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = UISDKTheme.dimension.buttonPadding,
    elevation: ButtonElevation? = null,
    onClick: (() -> Unit)? = null
) {
    UISDKOutlinedTextButton(
        modifier = modifier,
        text = text,
        textStyle = textStyle,
        shape = shape,
        colors = colors,
        border = border,
        enabled = enabled,
        contentPadding = contentPadding,
        elevation = elevation,
        onClick = onClick
    )
}

/**
 * Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren't
 * the primary action in an app.
 *
 * @sample com.common.ui_sdk.samples.UISDKOutlinedTextButtonSample
 * @param text text String that will be displayed inside button.
 * @param textStyle TextStyle can be passed in to change default styling of the button's text.
 * See [UISDKTheme.typography]
 * @param modifier Modifier to be applied to the button
 * @param enabled Controls the enabled state of the button. When `false`, this button will not
 * be clickable
 * @param shape Defines the button's shape as well as its shadow. See [UISDKTheme.shapes]
 * @param border Border to draw around the button. See [UISDKTheme.dimension]
 * @param colors [ButtonColors] that will be used to resolve the background and content color for
 * this button in different states. See [UISDKTheme.colors].
 * @param contentPadding The spacing values to apply internally between the container and the content.
 * See [UISDKTheme.dimension]
 * @param elevation [ButtonElevation] used to resolve the elevation for this button in different
 * states. An OutlinedButton typically has no elevation, see [Button] for a button with elevation.
 * @param onClick Will be called when the user clicks the button
 */
@Composable
fun UISDKOutlinedTextButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String,
    textStyle: TextStyle = UISDKTheme.typography.button,
    shape: Shape = UISDKTheme.shapes.buttonShape,
    colors: ButtonColors = UISDKTheme.colors.outlineButtonColors(),
    border: BorderStroke? = BorderStroke(
        width = UISDKTheme.dimension.buttonBorderStrokeWidth,
        color = UISDKTheme.colors.borderCTAPrimary
    ),
    contentPadding: PaddingValues = UISDKTheme.dimension.buttonPadding,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    onClick: (() -> Unit)? = null
) {
    UISDKButton(
        modifier = modifier,
        shape = shape,
        colors = colors,
        border = border,
        enabled = enabled,
        contentPadding = contentPadding,
        elevation = elevation,
        onClick = onClick
    ){
        Column(
            modifier = Modifier.wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = text,
                style = textStyle.copy(color = colors.contentColor(enabled).value),
                textAlign = TextAlign.Center,
                maxLines = 1
            )
        }
    }
}

/**
 * UISDKButton is the base definition of Button, should only be used when
 * [UISDKTextButton] and [UISDKOutlinedTextButton] don't meet requirements.
 *
 * @sample com.common.ui_sdk.samples.UISDKButtonSample
 * See [UISDKTheme.typography]
 * @param modifier Modifier to be applied to the button
 * @param enabled Controls the enabled state of the button. When `false`, this button will not
 * be clickable
 * @param shape Defines the button's shape as well as its shadow. See [UISDKTheme.shapes]
 * @param border Border to draw around the button. See [UISDKTheme.dimension] and [UISDKTheme.colors]
 * @param colors [ButtonColors] that will be used to resolve the background and content color for
 * this button in different states. See [UISDKTheme.colors].
 * @param contentPadding The spacing values to apply internally between the container and the content.
 * See [UISDKTheme.dimension]
 * @param elevation [ButtonElevation] used to resolve the elevation for this button in different
 * states. An OutlinedButton typically has no elevation, see [Button] for a button with elevation.
 * @param onClick Will be called when the user clicks the button
 * @param content content that will be displayed inside the button
 */
@Composable
fun UISDKButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = UISDKTheme.shapes.buttonShape,
    colors: ButtonColors = UISDKTheme.colors.buttonColors(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = UISDKTheme.dimension.buttonPadding,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    onClick: (() -> Unit)? = null,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier
            .heightIn(min = UISDKTheme.dimension.buttonMinHeight)
            .wrapContentHeight(),
        onClick = { onClick?.invoke() },
        enabled = enabled,
        contentPadding = contentPadding,
        shape = shape,
        border = border,
        elevation = elevation,
        colors = colors,
        content = content
    )
}