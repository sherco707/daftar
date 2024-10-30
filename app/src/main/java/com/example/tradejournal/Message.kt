package com.example.tradejournal

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Daftar")
class Message (
    @PrimaryKey(autoGenerate = true)
    var id :Int = 1,
    var mavzu:String,
    var malumot:String

){

}
