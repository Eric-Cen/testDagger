package com.example.android.roomwordssample.storage

import android.content.Context
import androidx.room.Room
import com.example.android.roomwordssample.WordDao
import com.example.android.roomwordssample.WordRoomDatabase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseStorage @Inject constructor(val context : Context) : Storage {

    private val localDatabase = Room.databaseBuilder(
    context.applicationContext,
    WordRoomDatabase::class.java,
    "word_database"
    )
    // .addCallback(WordRoomDatabase.Companion.WordDatabaseCallback(CoroutineScope(Dispatchers.IO)))
    .build()


    override fun getWordDao(): WordDao {
        return localDatabase.wordDao()
    }
}