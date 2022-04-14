package vigor.fitness.calisthenicsmaster.core.data.models

import vigor.fitness.calisthenicsmaster.core.domain.entities.ExerciseState

data class ExerciseStateModel(
    val record: Int,
    val lastSetResult: List<Int>
) {
    fun toEntity() : ExerciseState {
        return ExerciseState(
            record = this.record,
            lastSetResult = this.lastSetResult
        )
    }
}
