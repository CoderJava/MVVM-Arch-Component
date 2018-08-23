package com.ysn.examplemvvmarchcomponent.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ysn.examplemvvmarchcomponent.model.Post
import com.ysn.examplemvvmarchcomponent.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}