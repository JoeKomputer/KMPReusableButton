package com.common.ui_sdk.samples

import androidx.compose.runtime.Composable
import com.common.ui_sdk.components.UISDKButton
import com.common.ui_sdk.components.UISDKOutlinedTextButton
import com.common.ui_sdk.components.UISDKTextButton

@Composable
fun UISDKOutlinedTextButtonSample() {
    UISDKOutlinedTextButton(
        text = "text here",
        onClick = {
            // do something
        }
    )
}

@Composable
fun UISDKTextButtonSample() {
    UISDKTextButton(
        text = "text here",
        onClick = {
            // do something
        }
    )
}

@Composable
fun UISDKButtonSample() {
    UISDKButton(
        onClick = {
            // do something
        }
    ){
        //buttons content here
    }
}
