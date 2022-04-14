package vigor.fitness.calisthenicsmaster.core.data.models

import vigor.fitness.calisthenicsmaster.core.domain.entities.Stretching

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
