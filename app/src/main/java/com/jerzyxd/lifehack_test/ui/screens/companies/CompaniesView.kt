package com.jerzyxd.lifehack_test.ui.screens.companies

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.jerzyxd.lifehack_test.domain.models.CompanyModel

interface CompaniesView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCompanies(list: List<CompanyModel>)
}