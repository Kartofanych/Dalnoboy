package com.inno.impl.di

import com.inno.common.di.AppScope
import com.inno.common.di.FeatureEntry
import com.inno.common.di.FeatureEntryKey
import com.inno.api.di.Feature1Entry
import com.inno.impl.Feature1EntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface Feature1EntryModule {

    @Binds
    @AppScope
    @IntoMap
    @FeatureEntryKey(com.inno.api.di.Feature1Entry::class)
    fun tripsFridgeEntry(entry: Feature1EntryImpl): FeatureEntry
}