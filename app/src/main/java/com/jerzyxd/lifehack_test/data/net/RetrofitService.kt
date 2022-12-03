package com.jerzyxd.lifehack_test.data.net

import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel
import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("test.php")
    suspend fun getCompanies(): List<CompanyModel>

    @GET("test.php")
    suspend fun getCompanyInfo(@Query("id") id: String): List<CompanyInfoModel>
}