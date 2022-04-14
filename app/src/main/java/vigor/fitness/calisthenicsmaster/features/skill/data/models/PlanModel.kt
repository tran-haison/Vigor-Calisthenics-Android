package vigor.fitness.calisthenicsmaster.features.skill.data.models

import vigor.fitness.calisthenicsmaster.core.data.models.ExerciseStateModel
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan

data class PlanModel(
    val nr: Int,
    val name: String,
    val set: Int,
    val beat: Int,
    val exerciseState: ExerciseStateModel,
    val pauseAfterSet: Int,
    val pauseAfterExercise: Int,
    val description: String? = null,
    val dynamic: Boolean? = null,
) {
    fun toEntity(): Plan {
        return Plan(
            nr = this.nr,
            name = this.name,
            set = this.set,
            beat = this.beat,
            exerciseState = this.exerciseState.toEntity(),
            pauseAfterSet = this.pauseAfterSet,
            pauseAfterExercise = this.pauseAfterExercise,
            description = this.description,
            dynamic = this.dynamic,
        )
    }
}
