package com.jerzyxd.lifehack_test.ui.screens.splash

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpView
import com.jerzyxd.lifehack_test.ui.ext.createEmptyHandler
import com.jerzyxd.lifehack_test.ui.screens.companies.CompaniesScreen
import kotlinx.coroutines.delay
import online.jutter.supersld.common.base.BasePresenter
import online.jutter.supersld.extensions.launchIO
import online.jutter.supersld.extensions.withUI

@InjectViewState
class SplashPresenter: BasePresenter<MvpView>() {

    fun onBack() {
        router?.exit()
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        start()
    }

    private fun start() {
        launchIO(createEmptyHandler()) {
            delay(2000)
            withUI {
                router?.newRootScreen(CompaniesScreen())
            }
        }
    }
}