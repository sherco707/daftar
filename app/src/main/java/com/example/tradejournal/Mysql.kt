package com.example.tradejournal

import androidx.room.Dao
import androidx.room.Query

@Dao
interface Mysql {
    @Query("INSERT INTO Daftar (mavzu,malumot)VALUES(:mavzu,:malumot)")
    fun addText(mavzu:String,malumot:String)
    @Query("SELECT*FROM Daftar")
    fun getAll(): List<Message>

    @Query("DELETE FROM Daftar where id=:idkodi")
    fun delet(idkodi: Int)
}