package com.bonifaciotech.p1_ap2_danilo_20190266.di

import android.content.Context
import androidx.room.Room
import com.bonifaciotech.p1_ap2_danilo_20190266.data.PrestamoDb
import com.bonifaciotech.p1_ap2_danilo_20190266.data.prestamoDao
import com.bonifaciotech.p1_ap2_danilo_20190266.data.repository.prestamoRepository
import com.bonifaciotech.p1_ap2_danilo_20190266.model.Prestamo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun ProvidePrestamoDb(@ApplicationContext context: Context):PrestamoDb{
        return Room.databaseBuilder(
            context,
            PrestamoDb::class.java,
            "PrestamoDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun ProvidesPrestamoRepository(prestamoDao: prestamoDao): prestamoRepository{
        return prestamoRepository(prestamoDao)
    }

    @Provides
    fun ProvidesPrestamo(prestamoDb: PrestamoDb): prestamoDao{
        return prestamoDb.prestamoDao
    }


}