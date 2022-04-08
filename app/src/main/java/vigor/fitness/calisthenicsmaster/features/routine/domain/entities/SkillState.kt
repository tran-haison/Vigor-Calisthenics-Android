package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SkillState(
    @PrimaryKey
    val skillID: Int,
    val currentProgress: Int,
    val progress: Double
)