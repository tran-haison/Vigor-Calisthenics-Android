package vigor.fitness.calisthenicsmaster.core.data.models

import vigor.fitness.calisthenicsmaster.core.domain.entities.ProgressState

data class ProgressStateModel(
    val progressId: Int,
    val finished: Boolean,
    val currentProgress: Boolean,
    val status: Double
) {
    fun toEntity() : ProgressState {
        return ProgressState(
            progressId = this.progressId,
            finished = this.finished,
            currentProgress = this.currentProgress,
            status = this.status
        )
    }
}
