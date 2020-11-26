package com.android.mvp_architecture_kotlin.di

import android.app.Application
import android.content.Context
import com.android.mvp_architecture_kotlin.data.source.local.shareprefs.SharedPrefs
import com.android.mvp_architecture_kotlin.data.source.local.shareprefs.SharedPrefsImpl
import com.android.mvp_architecture_kotlin.di.scopes.AppScoped
import dagger.Binds
import dagger.Module

@Module(includes = [AppModule.AppAbstractModule::class])
class AppModule {
    @Module
    interface AppAbstractModule {
        @AppScoped
        @Binds
        fun bindApplicationContext(application: Application): Context

        @AppScoped
        @Binds
        fun bindSharedPreference(sharedPrefs: SharedPrefsImpl): SharedPrefs
    }
}
