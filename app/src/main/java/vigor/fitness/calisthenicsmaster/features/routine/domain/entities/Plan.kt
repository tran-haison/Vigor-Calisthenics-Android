package vigor.fitness.calisthenicsmaster.features.routine.domain.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import vigor.fitness.calisthenicsmaster.core.domain.entities.ExerciseState

@Entity
data class Plan(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val nr: Int,
    val name: String,
    val set: Int,
    val beat: Int,
    @Embedded(prefix = "exerciseState_")
    val exerciseState: ExerciseState,
    val pauseAfterSet: Int,
    val pauseAfterExercise: Int
)