package com.jerzyxd.lifehack_test.ui.screens.company_info

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel

interface CompanyInfoView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCompanyInfo(model: CompanyInfoModel)
}