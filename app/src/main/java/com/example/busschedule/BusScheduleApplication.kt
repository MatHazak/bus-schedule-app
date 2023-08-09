package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.BusScheduleDatabase

class BusScheduleApplication : Application() {
    val database: BusScheduleDatabase by lazy { BusScheduleDatabase.getDatabase(this) }
}