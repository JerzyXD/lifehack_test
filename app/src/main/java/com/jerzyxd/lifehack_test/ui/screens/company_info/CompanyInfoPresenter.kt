package com.jerzyxd.lifehack_test.ui.screens.company_info

import com.arellomobile.mvp.InjectViewState
import com.jerzyxd.lifehack_test.domain.usecases.GetCompanyInfoUseCase
import com.jerzyxd.lifehack_test.ui.ext.createHandler
import online.jutter.supersld.common.base.BasePresenter
import online.jutter.supersld.extensions.launchUI
import online.jutter.supersld.extensions.withIO
import org.koin.core.inject

@InjectViewState
class CompanyInfoPresenter: BasePresenter<CompanyInfoView>() {

    private val getCompanyInfoUseCase: GetCompanyInfoUseCase by inject()

    fun onBack() {
      router?.exit()
    }

    fun getCompanyInfo(id: String) {

        launchUI(createHandler {  }) {

            val companyInfo = withIO { getCompanyInfoUseCase(id) }
            viewState.showCompanyInfo(companyInfo)
        }
    }

    fun createMapUrl(lat: Double, lon: Double): String = "https://yandex.ru/maps/?from=tabbar&ll=${lat}%2C${lon}&mode=search&sll=${lat}%2C${lon}&source=serp_navig&text=${lat}%2C${lon}&z=16"
}