package vigor.fitness.calisthenicsmaster.core.data.models

import vigor.fitness.calisthenicsmaster.core.domain.entities.WarmUp

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
