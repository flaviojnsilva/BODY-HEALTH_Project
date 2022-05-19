package com.ufp.bodyhealth

import android.arch.persistence.room.TypeConverter
import java.sql.Date

class UserConverters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}
