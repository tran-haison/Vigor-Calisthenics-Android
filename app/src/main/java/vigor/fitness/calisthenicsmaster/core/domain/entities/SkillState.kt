package vigor.fitness.calisthenicsmaster.core.domain.entities

data class SkillState(
    val skillID: Int,
    val currentProgress: Int,
    val progress: Double
)