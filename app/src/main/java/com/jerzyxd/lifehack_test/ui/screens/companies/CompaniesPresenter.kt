package com.jerzyxd.lifehack_test.ui.screens.companies

import com.arellomobile.mvp.InjectViewState
import com.jerzyxd.lifehack_test.domain.usecases.GetCompaniesUseCase
import com.jerzyxd.lifehack_test.ui.ext.createHandler
import com.jerzyxd.lifehack_test.ui.screens.company_info.CompanyInfoScreen
import online.jutter.supersld.common.base.BasePresenter
import online.jutter.supersld.extensions.launchUI
import online.jutter.supersld.extensions.withIO
import org.koin.core.inject

@InjectViewState
class CompaniesPresenter: BasePresenter<CompaniesView>() {

    private val getCompaniesUseCase: GetCompaniesUseCase by inject()

    fun onBack() {
        router?.exit()
    }

    fun getCompanies() {
        launchUI(createHandler {
        }) {
            val list = withIO { getCompaniesUseCase() }
            viewState.showCompanies(list)
        }
    }

    fun onCompany(id: String) {
        router?.navigateTo(CompanyInfoScreen(id))
    }
}