package com.example.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities=[Todo::class],
    version=1
)
abstract class ToDoDatabase: RoomDatabase() {
    abstract val dao:TodoDao
}