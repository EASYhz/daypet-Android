package com.easyhz.daypet.domain.usecase.sign

import com.easyhz.daypet.domain.base.BaseUseCase
import com.easyhz.daypet.domain.param.sign.UserInfoParam
import com.easyhz.daypet.domain.repository.sign.AuthRepository
import javax.inject.Inject

class SaveUserInfoUseCase @Inject constructor(
    private val authRepository: AuthRepository
): BaseUseCase<UserInfoParam, Unit>() {
    override suspend fun invoke(param: UserInfoParam): Result<Unit> =
        authRepository.saveUserInfo(param)
}