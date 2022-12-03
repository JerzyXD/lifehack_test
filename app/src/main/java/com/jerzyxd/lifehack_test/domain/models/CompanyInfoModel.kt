package com.jerzyxd.lifehack_test.domain.models

import com.google.gson.annotations.SerializedName

data class CompanyInfoModel(
    val id: String,
    val img: String,
    val description: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val phone: String,
    @SerializedName("www")
    val site: String
)