package com.android.mvp_architecture_kotlin.app

import android.app.Application
import com.android.mvp_architecture_kotlin.di.ActivityBindingModule
import com.android.mvp_architecture_kotlin.di.AppModule
import com.android.mvp_architecture_kotlin.di.FragmentBindingModule
import com.android.mvp_architecture_kotlin.di.RepositoryLocalModule
import com.android.mvp_architecture_kotlin.di.scopes.AppScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScoped
@Component(
    modules = [
        AppModule::class,
        RepositoryLocalModule::class,
        ActivityBindingModule::class,
        FragmentBindingModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface AppComponent :
    AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
