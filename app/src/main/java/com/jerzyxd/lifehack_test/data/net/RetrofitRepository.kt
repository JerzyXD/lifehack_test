package com.jerzyxd.lifehack_test.data.net

import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel
import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import com.jerzyxd.lifehack_test.domain.net.CompanyNetRepository
import retrofit2.Retrofit

class RetrofitRepository(retrofit: Retrofit): CompanyNetRepository {

    private val service by lazy { retrofit.create(RetrofitService::class.java) }

    override suspend fun getCompanies(): List<CompanyModel> = service.getCompanies()

    override suspend fun getCompanyInfo(id: String): CompanyInfoModel = service.getCompanyInfo(id)[0]

}