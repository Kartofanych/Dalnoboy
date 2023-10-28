package com.inno.dalnoboy.di

import com.inno.common.di.AppProvider
import com.inno.common.di.AppScope
import dagger.Component

@AppScope
@Component(
    dependencies = [],
    modules = [NavigationModule::class]
)
interface AppComponent : AppProvider