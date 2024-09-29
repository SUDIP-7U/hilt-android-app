package com.example.moduleapplication.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object Module {


    @Provides
    @Singleton
    fun Getmyhome(){


    }
    @Provides
    @Singleton
    fun Getpesponse(){


    }
}

