package com.jerzyxd.lifehack_test.ui.screens.companies

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.jerzyxd.lifehack_test.R
import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import kotlinx.android.synthetic.main.fragment_companies.*
import online.jutter.supersld.common.base.BaseFragment
import online.jutter.supersld.extensions.addSystemTopPadding

class CompaniesFragment: BaseFragment(R.layout.fragment_companies), CompaniesView {

    @InjectPresenter
    lateinit var presenter: CompaniesPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getCompanies()
        recycleView.addSystemTopPadding()
    }

    override fun onBackPressed() {
        presenter.onBack()
    }

    override fun showCompanies(list: List<CompanyModel>) {
        with(recycleView) {
            adapter = CompaniesAdapter(list, requireContext()) {presenter.onCompany(it)}
            layoutManager = LinearLayoutManager(context)
        }
    }
}