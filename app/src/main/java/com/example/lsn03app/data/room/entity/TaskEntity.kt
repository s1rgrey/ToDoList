package com.example.lsn03app.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Task")
data class TaskEntity (
	@PrimaryKey(autoGenerate = true)
	val id:Int,
	val name:String,
	val description :String,
	val taskListId:Int,
	val isFavourite:Boolean,
	val createDate:String,
)