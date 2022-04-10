package vigor.fitness.calisthenicsmaster.features.routine.domain.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListIntConverter
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListStringConverter

@Entity
@TypeConverters(
    ListIntConverter::class,
    ListStringConverter::class
)
data class Routine(
    @PrimaryKey
    val id: Int,
    val belongingRoutineIDs: List<Int>,
    val name: String,
    val exercisePic: String,
    val exercisePicDark: String,
    val progress: Int,
    val dynamicExercise: Boolean,
    val video: String,
    val videoURL: String,
    val videoStart: Int,
    val videoEnd: Int,
    val muscles: String,
    val musclesIcons: List<String>,
    val difficulty: String,
    val techniqueSummary: String,
    val description: String,
    val routine: Boolean,
    val skillPic: String,
    val titlePic: String,
    @Embedded(prefix = "skillState_")
    val skillState: SkillState,
)
