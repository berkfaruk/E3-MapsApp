package com.bfc.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bfc.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}