package com.kat.daggermultibindingmvvmsample.di.module

import androidx.lifecycle.ViewModel
import com.kat.daggermultibindingmvvmsample.activity.MainActivityViewModel
import com.kat.daggermultibindingmvvmsample.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(mainActivityViewModel: MainActivityViewModel) : ViewModel
}