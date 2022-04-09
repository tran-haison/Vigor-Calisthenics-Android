package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan

data class PlanModel(
    val nr: Int,
    val name: String,
    val set: Int,
    val beat: Int,
    val exerciseState: ExerciseStateModel,
    val pauseAfterSet: Int,
    val pauseAfterExercise: Int
) {
    fun toEntity() : Plan {
        return Plan(
            nr = this.nr,
            name = this.name,
            set = this.set,
            beat = this.beat,
            exerciseState = this.exerciseState.toEntity(),
            pauseAfterSet = this.pauseAfterSet,
            pauseAfterExercise = this.pauseAfterExercise
        )
    }
}
