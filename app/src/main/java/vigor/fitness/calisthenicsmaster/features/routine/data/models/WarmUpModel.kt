package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.WarmUp

data class WarmUpModel(
    val name: String,
    val beat: Int
) {
    fun toEntity() : WarmUp {
        return WarmUp(
            name = this.name,
            beat = this.beat
        )
    }
}
