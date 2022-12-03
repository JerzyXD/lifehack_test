package com.jerzyxd.lifehack_test.domain.net

import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel
import com.jerzyxd.lifehack_test.domain.models.CompanyModel

interface CompanyNetRepository {

    suspend fun getCompanies() : List<CompanyModel>

    suspend fun getCompanyInfo(id: String) : CompanyInfoModel
}