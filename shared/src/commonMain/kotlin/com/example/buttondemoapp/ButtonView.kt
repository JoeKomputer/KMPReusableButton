package com.example.buttondemoapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.common.ui_sdk.components.UISDKOutlinedTextButton
import com.common.ui_sdk.components.UISDKTextButton

@Composable
fun ButtonView(
    headerText : String,
    buttonOneText: String,
    buttonTwoText : String,
    clickCount : MutableIntState
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.padding(top = 20.dp)) {
            Text(text = headerText)
        }
        Row {
            UISDKOutlinedTextButton(
                text = buttonOneText,
                onClick = {
                    clickCount.intValue += 1
                }
            )
        }
        Row {
            UISDKTextButton(
                text = buttonTwoText,
                onClick = {
                    clickCount.intValue += 2
                }
            )
        }
    }
}