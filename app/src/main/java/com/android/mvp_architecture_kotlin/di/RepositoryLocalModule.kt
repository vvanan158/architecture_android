package com.android.mvp_architecture_kotlin.di

import dagger.Module

@Module(includes = [RepositoryLocalModule.RepositoryLocalAbstractModule::class])
class RepositoryLocalModule {
    @Module
    interface RepositoryLocalAbstractModule {
    }
}
