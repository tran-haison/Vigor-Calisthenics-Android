package vigor.fitness.calisthenicsmaster.features.routine.domain.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListIntConverter

@Entity
@TypeConverters(ListIntConverter::class)
data class ExerciseState(
    @PrimaryKey(autoGenerate = true)
    @Transient
    val id: Int,
    val record: Int,
    val lastSetResult: List<Int>
)