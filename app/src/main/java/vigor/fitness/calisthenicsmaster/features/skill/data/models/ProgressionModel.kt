package vigor.fitness.calisthenicsmaster.features.skill.data.models

import vigor.fitness.calisthenicsmaster.core.data.models.ProgressStateModel
import vigor.fitness.calisthenicsmaster.core.data.models.WarmUpModel
import vigor.fitness.calisthenicsmaster.core.data.models.StretchingModel
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.*

data class ProgressionModel(
    val id: Int,
    val name: String,
    val level: Int,
    val progressState: ProgressStateModel,
    val goal: Int,
    val description: String,
    val warmUp: List<WarmUpModel>,
    val stretching: List<StretchingModel>,
    val plan: List<PlanModel>
) {
    fun toEntity(): Progression {
        return Progression(
            id = this.id,
            name = this.name,
            level = this.level,
            progressState = this.progressState.toEntity(),
            goal = this.goal,
            description = this.description,
            warmUp = this.warmUp.map { it.toEntity() },
            stretching = this.stretching.map { it.toEntity() }
        )
    }
}
