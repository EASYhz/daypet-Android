package com.easyhz.daypet.domain.repository.todo

import com.easyhz.daypet.domain.model.todo.Todo
import com.easyhz.daypet.domain.param.todo.TodoParam

interface TodoRepository {
    suspend fun fetchTodosOnDate(data: TodoParam): Result<List<Todo>>
}