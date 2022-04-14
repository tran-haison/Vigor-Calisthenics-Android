package vigor.fitness.calisthenicsmaster.features.skill.domain.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import vigor.fitness.calisthenicsmaster.core.domain.entities.SkillState
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListIntConverter

@Entity
@TypeConverters(
    ListIntConverter::class
)
data class Skill(
    @PrimaryKey
    val id: Int,
    val belongingRoutineIDs: List<Int>,
    val name: String,
    val description: String,
    val routine: Boolean,
    val skillPic: String,
    val titlePic: String,
    @Embedded(prefix = "skillState_")
    val skillState: SkillState,
)
