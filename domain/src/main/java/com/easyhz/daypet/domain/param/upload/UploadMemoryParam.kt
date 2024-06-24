package com.easyhz.daypet.domain.param.upload

import com.easyhz.daypet.domain.model.upload.Member
import java.time.LocalDate
import java.time.LocalTime

data class UploadMemoryParam(
    val title: String,
    val date: LocalDate,
    val time: LocalTime,
    val images: List<String>,
    val members: List<Member>,
    val content: String
)
