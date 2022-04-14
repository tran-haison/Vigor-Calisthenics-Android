package vigor.fitness.calisthenicsmaster.core.domain.entities

data class ProgressState(
    val progressId: Int,
    val finished: Boolean,
    val currentProgress: Boolean,
    val status: Double
)