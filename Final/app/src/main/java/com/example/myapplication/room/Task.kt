package com.example.myapplication.room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey



@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var description: String,
    var completed: String,
    var user_uid: Int
)

@Entity
data class  User(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var name: String
)