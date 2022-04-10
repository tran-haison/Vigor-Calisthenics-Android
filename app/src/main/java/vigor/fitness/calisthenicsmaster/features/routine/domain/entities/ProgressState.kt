package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


data class ProgressState(
    val progressId: Int,
    val finished: Boolean,
    val currentProgress: Boolean,
    val status: Double
)