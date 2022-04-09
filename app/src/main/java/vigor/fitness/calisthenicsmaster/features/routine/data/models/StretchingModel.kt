package vigor.fitness.calisthenicsmaster.features.routine.data.models

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Stretching

data class StretchingModel(
    val name: String,
    val beat: Int,
) {
    fun toEntity() : Stretching {
        return Stretching(
            name = this.name,
            beat = this.beat
        )
    }
}
