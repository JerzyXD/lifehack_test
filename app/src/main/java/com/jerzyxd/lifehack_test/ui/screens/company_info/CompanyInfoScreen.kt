package com.jerzyxd.lifehack_test.ui.screens.company_info

import com.jerzyxd.lifehack_test.ui.common.AppScreen

class CompanyInfoScreen(val id: String) : AppScreen() {
    override fun getFragment() = CompanyInfoFragment(id)
}