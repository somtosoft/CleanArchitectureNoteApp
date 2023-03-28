package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository:NoteRepository
) {
}