package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM Schedule ORDER BY arrival_time")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM Schedule WHERE stop_name = :stopName ORDER BY arrival_time")
    fun getByStopName(stopName: String): Flow<List<Schedule>>
}