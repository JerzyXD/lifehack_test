package com.jerzyxd.lifehack_test.domain.net

import com.jerzyxd.lifehack_test.domain.models.CompanyModel

interface CompanyNetRepository {

    suspend fun getCompanies() : List<CompanyModel>
}