package com.codzure.leonard.multi_module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.codzure.leonard.multi_module.ui.theme.MultiModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleTheme {

            }
        }
    }
}
