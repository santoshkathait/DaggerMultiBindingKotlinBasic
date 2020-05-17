package com.kat.daggermultibindingmvvmsample.di.component

import android.app.Application
import com.kat.daggermultibindingmvvmsample.DaggerMVVMMultiBindingApplication
import com.kat.daggermultibindingmvvmsample.di.module.ActivityBuilderModule
import com.kat.daggermultibindingmvvmsample.di.module.ApiModule
import com.kat.daggermultibindingmvvmsample.di.module.AppModule
import com.kat.daggermultibindingmvvmsample.di.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton


@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class,
        AppModule::class, ApiModule::class, ViewModelFactoryModule::class]
)
interface AppComponent : AndroidInjector<DaggerMVVMMultiBindingApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance // you'll call this when setting up Dagger
        fun baseUrl(@Named("baseUrl") baseUrl: String): Builder

        fun build(): AppComponent
    }

}
