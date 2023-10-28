package com.inno.dalnoboy.di

import com.inno.impl.di.Feature1EntryModule
import dagger.Module

@Module(
    includes = [Feature1EntryModule::class]
)
interface NavigationModule