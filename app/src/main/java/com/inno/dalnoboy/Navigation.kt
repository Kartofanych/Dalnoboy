package com.inno.dalnoboy

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.inno.api.di.Feature1Entry
import com.inno.common.di.LocalAppProvider
import com.inno.common.di.find

@Composable
fun Navigation() {
    val destinations = LocalAppProvider.current.destinations

    val feature1Entry = destinations.find<Feature1Entry>()

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "feature1") {
        with(feature1Entry) {
            composable(navController, destinations)
        }
    }
}