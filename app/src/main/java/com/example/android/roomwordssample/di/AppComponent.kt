package com.example.android.roomwordssample.di

import android.content.Context
import com.example.android.roomwordssample.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory{
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context : Context): AppComponent
    }

    // Class that can be injected by this Component
    fun inject(activity : MainActivity)

}