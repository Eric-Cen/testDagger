package com.example.android.roomwordssample

import android.app.Application
import com.example.android.roomwordssample.di.AppComponent
import com.example.android.roomwordssample.di.DaggerAppComponent
import com.example.android.roomwordssample.di.StorageModule

open class MyApplication : Application(){

    // Instance of the AppComponent that will be used by all Activities in the project
    val appComponent : AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
         return DaggerAppComponent
                 .factory()
                 .create(applicationContext)
    }
}