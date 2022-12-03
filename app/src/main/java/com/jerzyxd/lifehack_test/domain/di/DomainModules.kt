package com.jerzyxd.lifehack_test.domain.di

import com.jerzyxd.lifehack_test.domain.usecases.GetCompaniesUseCase
import com.jerzyxd.lifehack_test.domain.usecases.GetCompanyInfoUseCase
import org.koin.core.module.Module

fun Module.provideDomainModules() {

    single { GetCompaniesUseCase(get()) }
    single { GetCompanyInfoUseCase(get()) }

}