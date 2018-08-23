package com.ysn.examplemvvmarchcomponent.base

import android.arch.lifecycle.ViewModel
import com.ysn.examplemvvmarchcomponent.injection.component.DaggerViewModelInjector
import com.ysn.examplemvvmarchcomponent.injection.component.ViewModelInjector
import com.ysn.examplemvvmarchcomponent.injection.module.NetworkModule
import com.ysn.examplemvvmarchcomponent.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }

}