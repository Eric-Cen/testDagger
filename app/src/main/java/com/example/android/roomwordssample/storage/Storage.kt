package com.example.android.roomwordssample.storage

import com.example.android.roomwordssample.WordDao

interface Storage {
    fun getWordDao() : WordDao
}