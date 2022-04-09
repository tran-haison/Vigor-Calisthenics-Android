package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProgressState(
    @PrimaryKey
    val progressId: Int,
    val finished: Boolean,
    val currentProgress: Boolean,
    val status: Double
)