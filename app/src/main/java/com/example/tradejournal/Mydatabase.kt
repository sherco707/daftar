package com.example.tradejournal

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Message::class], exportSchema = true, version = 1)

abstract class Mydatabase : RoomDatabase() {
    abstract fun myQuvery(): Mysql

    //xzvczxvz
    companion object {

        fun getDb(context: Context): Mydatabase {
            return Room.databaseBuilder(context, Mydatabase::class.java, "My.db")
                .allowMainThreadQueries().build()
        }
    }
}