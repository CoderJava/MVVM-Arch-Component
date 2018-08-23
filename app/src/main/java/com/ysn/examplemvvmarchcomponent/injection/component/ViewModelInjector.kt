package com.ysn.examplemvvmarchcomponent.injection.component

import com.ysn.examplemvvmarchcomponent.injection.module.NetworkModule
import com.ysn.examplemvvmarchcomponent.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postListViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }

}