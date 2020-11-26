package com.android.mvp_architecture_kotlin.di

import com.android.mvp_architecture_kotlin.di.scopes.ActivityScoped
import com.android.mvp_architecture_kotlin.ui.main.MainActivity
import com.android.mvp_architecture_kotlin.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributeMainActivity(): MainActivity
}
