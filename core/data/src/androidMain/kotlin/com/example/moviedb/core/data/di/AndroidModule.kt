package com.example.moviedb.core.data.di


import io.ktor.client.engine.android.Android
import org.koin.dsl.module

/**
 * Android platform specific module
 */
val androidDataModule = module {
    single { Android.create() }  //for inject httpClientEngine
}
