package com.jerzyxd.lifehack_test.ui.screens.company_info

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.jerzyxd.lifehack_test.BuildConfig
import com.jerzyxd.lifehack_test.R
import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel
import kotlinx.android.synthetic.main.fragment_company_info.*
import online.jutter.supersld.common.base.BaseFragment
import online.jutter.supersld.extensions.addSystemBottomPadding

class CompanyInfoFragment(val id: String): BaseFragment(R.layout.fragment_company_info), CompanyInfoView {

    @InjectPresenter
    lateinit var presenter: CompanyInfoPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getCompanyInfo(id)

        close.setOnClickListener { onBackPressed() }

    }

    override fun onBackPressed() {
        presenter.onBack()
    }

    override fun showCompanyInfo(model: CompanyInfoModel) {
        Glide.with(requireContext()).load(BuildConfig.BASE_URL + model.img).into(image)

        company_name.text = model.name
        company_description.text = model.description

        if (model.site.isNotEmpty()) {
            view_site.visibility = View.VISIBLE
            company_site.text = model.site
        }

        if (model.phone.isNotEmpty()) {
            view_phone.visibility = View.VISIBLE
            company_phone.text = model.phone
        }

        if (model.lat != 0.0 || model.lon != 0.0) {
            with(company_map) {
                visibility = View.VISIBLE
                setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse(presenter.createMapUrl(
                            lat = model.lat,
                            lon = model.lon)))
                    startActivity(intent) }
            }

        }
    }
}