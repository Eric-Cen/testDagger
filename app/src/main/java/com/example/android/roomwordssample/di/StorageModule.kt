package com.example.android.roomwordssample.di

import android.content.Context
import androidx.room.Room
import com.example.android.roomwordssample.WordDao
import com.example.android.roomwordssample.WordRoomDatabase
import dagger.Binds
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

@Module
class StorageModule constructor(val context: Context) {

    // Makes Dagger provide WordDao from Room database when it is requested
    @Provides
    fun provideDatabase(): WordRoomDatabase {
        return Room.databaseBuilder(
                context.applicationContext,
                WordRoomDatabase::class.java,
                "word_database"
        )
               // .addCallback(WordRoomDatabase.Companion.WordDatabaseCallback(CoroutineScope(Dispatchers.IO)))
                .build()
    }

    @Provides
    fun provideWordDao(wordDatabase: WordRoomDatabase): WordDao {
        return wordDatabase.wordDao()
    }



}