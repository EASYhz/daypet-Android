package com.easyhz.daypet.domain.repository.memory

import com.easyhz.daypet.domain.model.memory.Memory
import com.easyhz.daypet.domain.param.memory.MemoryParam

interface MemoryRepository {
    suspend fun fetchMemoriesOnDate(data: MemoryParam): Result<List<Memory>>
}