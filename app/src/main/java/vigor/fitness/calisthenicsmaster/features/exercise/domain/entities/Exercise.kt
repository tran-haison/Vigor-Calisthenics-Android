package vigor.fitness.calisthenicsmaster.features.exercise.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListStringConverter

@Entity
@TypeConverters(ListStringConverter::class)
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val description: String,
    val dynamicExercise: Boolean,
    val titlePic: String,
    val exercisePic: String,
    val exercisePicDark: String,
    val muscles: String,
    val musclesIcons: List<String>,
    val video: String,
    val videoURL: String,
    val videoStart: Int,
    val videoEnd: Int,
    val difficulty: String,
    val unilateral: Boolean,
    val techniqueSummary: String,
    val exercisePic2: String? = null
)