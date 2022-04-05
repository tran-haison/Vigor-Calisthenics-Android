package vigor.fitness.calisthenicsmaster.features.exercise.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(

    @PrimaryKey(autoGenerate = true)
    @Transient
    val id: Int,

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