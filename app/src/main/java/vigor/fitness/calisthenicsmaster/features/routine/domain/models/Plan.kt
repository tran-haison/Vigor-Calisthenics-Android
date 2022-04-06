package vigor.fitness.calisthenicsmaster.features.routine.domain.models


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Plan(
    @PrimaryKey(autoGenerate = true)
    @Transient
    val id: Int,
    val nr: Int,
    val name: String,
    val `set`: Int,
    val beat: Int,
    val exerciseState: ExerciseState,
    val pauseAfterSet: Int,
    val pauseAfterExercise: Int
)