package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


data class SkillState(
    val skillID: Int,
    val currentProgress: Int,
    val progress: Double
)