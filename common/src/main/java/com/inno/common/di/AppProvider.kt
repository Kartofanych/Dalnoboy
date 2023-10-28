package com.inno.common.di

import androidx.compose.runtime.compositionLocalOf

interface AppProvider {

    val destinations: Destinations
}

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }