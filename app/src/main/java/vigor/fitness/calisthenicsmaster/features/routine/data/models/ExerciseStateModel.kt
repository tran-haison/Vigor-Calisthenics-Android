package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.ExerciseState

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
