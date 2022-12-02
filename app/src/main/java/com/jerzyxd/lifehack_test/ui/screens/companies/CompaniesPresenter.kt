package com.jerzyxd.lifehack_test.ui.screens.companies

import com.arellomobile.mvp.InjectViewState
import com.jerzyxd.lifehack_test.domain.usecases.CompaniesUseCase
import com.jerzyxd.lifehack_test.ui.ext.createHandler
import online.jutter.supersld.common.base.BasePresenter
import online.jutter.supersld.extensions.launchUI
import online.jutter.supersld.extensions.withIO
import org.koin.core.inject

@InjectViewState
class CompaniesPresenter: BasePresenter<CompaniesView>() {

    private val companiesUseCase: CompaniesUseCase by inject()

    fun onBack() {
        router?.exit()
    }

    fun getCompanies() {
        launchUI(createHandler {

        }) {
            val list = withIO { companiesUseCase() }
            viewState.showCompanies(list)
        }
    }
}