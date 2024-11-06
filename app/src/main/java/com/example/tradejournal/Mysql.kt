package com.example.tradejournal

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Mysql {
    @Query("INSERT INTO Daftar (mavzu,malumot)VALUES(:mavzu,:malumot)")
    fun addText(mavzu:String,malumot:String)
    @Query("SELECT*FROM Daftar")
    fun getAll(): List<Message>

    @Query("DELETE FROM Daftar where id=:MysqlId ")
     fun deleteUserId(MysqlId:Int)
}