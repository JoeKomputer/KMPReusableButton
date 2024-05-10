package com.example.buttondemoapp.android

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.common.ui_sdk.theme.UISDKTheme
import com.example.buttondemoapp.ButtonView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                UISDKTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = UISDKTheme.colors.layoutSurface
                    ) {
                        val clickCount = remember {
                            mutableIntStateOf(0)
                        }
                        ButtonView(
                            headerText = stringResource(R.string.here_is_a_button_clicked_times, clickCount.intValue),
                            buttonOneText = stringResource(R.string.click_here),
                            buttonTwoText = stringResource(R.string.click_here_for_2),
                            clickCount = clickCount
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, backgroundColor = Color.WHITE.toLong())
@Composable
fun DefaultPreview() {
    val clickCount = remember {
        mutableIntStateOf(0)
    }
    MyApplicationTheme {
        UISDKTheme {
            ButtonView(
                headerText = stringResource(R.string.here_is_a_button_clicked_times, clickCount.intValue),
                buttonOneText = stringResource(R.string.click_here),
                buttonTwoText = stringResource(R.string.click_here_for_2),
                clickCount = clickCount
            )
        }
    }
}
