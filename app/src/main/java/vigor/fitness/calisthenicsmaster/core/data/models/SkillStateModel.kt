package vigor.fitness.calisthenicsmaster.core.data.models

import vigor.fitness.calisthenicsmaster.core.domain.entities.SkillState

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
