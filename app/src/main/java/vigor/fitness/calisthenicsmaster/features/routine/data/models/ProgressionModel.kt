package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.*

data class ProgressionModel(
    val id: Int,
    val name: String,
    val level: Int,
    val goal: Int,
    val goalText: String,
    val progressState: ProgressStateModel,
    val warmUp: List<WarmUpModel>,
    val stretching: List<StretchingModel>,
    val plan: List<PlanModel>
) {
    fun toEntity() : Progression {
        return Progression(
            id = this.id,
            name = this.name,
            level = this.level,
            goal = this.goal,
            goalText = this.goalText,
            progressId = this.progressState.progressId,
            warmUp = this.warmUp.map { it.toEntity() },
            stretching = this.stretching.map { it.toEntity() }
        )
    }
}
