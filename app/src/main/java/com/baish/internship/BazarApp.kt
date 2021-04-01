package com.baish.internship

import android.app.Application
import com.baish.internship.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BazarApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BazarApp)
            modules(appModules)
        }
    }
}