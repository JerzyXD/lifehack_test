package com.jerzyxd.lifehack_test.domain.usecases

import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import com.jerzyxd.lifehack_test.domain.net.CompanyNetRepository

class CompaniesUseCase(
    private val companyNetRepository: CompanyNetRepository
) {

    suspend operator fun invoke(): List<CompanyModel> = companyNetRepository.getCompanies()
}