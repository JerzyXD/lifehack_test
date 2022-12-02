package com.jerzyxd.lifehack_test.ui.screens.global

import android.os.Bundle
import android.view.View
import com.jerzyxd.lifehack_test.ui.screens.splash.SplashScreen
import online.jutter.supersld.common.base.FlowFragment
import ru.terrakok.cicerone.commands.BackTo
import ru.terrakok.cicerone.commands.Replace

class FlowGlobalFragment: FlowFragment(ROUTER) {

    companion object {
        const val ROUTER = "APP_ROUTER"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (childFragmentManager.fragments.isEmpty()) {
            navigator.applyCommands(
                arrayOf(
                    BackTo(null),
                    Replace(SplashScreen())
                )
            )
        }
    }
}