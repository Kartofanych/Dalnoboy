package com.inno.impl.di

import com.inno.api.di.Feature1Provider
import com.inno.common.di.FeatureScope
import dagger.Component

@FeatureScope
@Component(
    modules = [Feature1Module::class]
)
interface Feature1Component: Feature1Provider {

    //val viewModel: ViewModel
}