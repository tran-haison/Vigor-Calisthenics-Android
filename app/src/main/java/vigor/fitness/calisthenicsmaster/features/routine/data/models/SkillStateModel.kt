package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.SkillState

data class SkillStateModel(
    val skillID: Int,
    val currentProgress: Int,
    val progress: Double
) {
    fun toEntity() : SkillState {
        return SkillState(
            skillID = this.skillID,
            currentProgress = this.currentProgress,
            progress = this.progress
        )
    }
}
