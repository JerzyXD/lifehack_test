package com.jerzyxd.lifehack_test.domain.usecases

import com.jerzyxd.lifehack_test.domain.models.CompanyInfoModel
import com.jerzyxd.lifehack_test.domain.net.CompanyNetRepository

class GetCompanyInfoUseCase(
    private val companyNetRepository: CompanyNetRepository
) {

    suspend operator fun invoke(id: String): CompanyInfoModel = companyNetRepository.getCompanyInfo(id)
}