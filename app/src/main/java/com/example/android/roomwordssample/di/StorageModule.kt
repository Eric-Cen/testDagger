package com.example.android.roomwordssample.di

import android.content.Context
import androidx.room.Room
import com.example.android.roomwordssample.WordDao
import com.example.android.roomwordssample.WordRoomDatabase
import com.example.android.roomwordssample.storage.DatabaseStorage
import com.example.android.roomwordssample.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

@Module
abstract class StorageModule {

    // Makes Dagger provide WordDao from Room database when it is requested
    @Binds
    abstract fun provideStorage(storage : DatabaseStorage) : Storage
}