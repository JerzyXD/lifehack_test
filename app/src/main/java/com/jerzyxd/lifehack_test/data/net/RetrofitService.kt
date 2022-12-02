package com.jerzyxd.lifehack_test.data.net

import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import retrofit2.http.GET

interface RetrofitService {

    @GET("test.php")
    suspend fun getCompanies(): List<CompanyModel>
}