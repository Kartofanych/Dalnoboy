package com.inno.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.inno.common.di.Destinations
import javax.inject.Inject

class Feature1EntryImpl @Inject constructor() : com.inno.api.di.Feature1Entry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        )
    }
}