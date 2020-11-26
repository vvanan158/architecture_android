package com.android.mvp_architecture_kotlin.ui.main

import com.android.mvp_architecture_kotlin.di.scopes.ActivityScoped
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [MainModule.MainAbstractModule::class])
class MainModule {

    @ActivityScoped
    @Provides
    fun bindMainViewPager(mainActivity: MainActivity): MainPagerAdapter {
        return MainPagerAdapter(mainActivity.supportFragmentManager)
    }

    @Module
    interface MainAbstractModule {
        @ActivityScoped
        @Binds
        fun bindMainView(mainActivity: MainActivity): MainContract.View

        @ActivityScoped
        @Binds
        fun bindMainPresenter(presenter: MainPresenter): MainContract.Presenter
    }
}
