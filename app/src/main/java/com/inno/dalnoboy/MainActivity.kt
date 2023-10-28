package com.inno.dalnoboy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.inno.common.di.LocalAppProvider
import com.inno.common.di.find
import com.inno.dalnoboy.ui.theme.DalnoboyTheme
import com.inno.api.di.Feature1Entry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DalnoboyTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CompositionLocalProvider(
                        LocalAppProvider provides application.appProvider,
                    ) {
                        Navigation()
                    }
                }
            }
        }
    }
}
