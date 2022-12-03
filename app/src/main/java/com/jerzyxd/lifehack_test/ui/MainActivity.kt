package com.jerzyxd.lifehack_test.ui

import androidx.fragment.app.Fragment
import com.jerzyxd.lifehack_test.R
import com.jerzyxd.lifehack_test.ui.screens.global.FlowGlobalScreen
import online.jutter.supersld.ActivityBase

class MainActivity : ActivityBase() {

    override fun getStartFragment() = FlowGlobalScreen().fragment

    override fun getStatusAndNavigationColor(): Pair<Int, Int> {
        return Pair(R.color.transparent, R.color.transparent)
    }

    fun Fragment.getMainActivity() = requireActivity() as MainActivity

    override fun themeIsDay() = false
}