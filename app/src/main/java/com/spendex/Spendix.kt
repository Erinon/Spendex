package com.spendex

import android.app.Application
import com.spendex.koin.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Spendix : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Spendix)
            modules(applicationModule)
        }
    }
}
