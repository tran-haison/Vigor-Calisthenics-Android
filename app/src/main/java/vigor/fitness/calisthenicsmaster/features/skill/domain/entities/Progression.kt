package vigor.fitness.calisthenicsmaster.features.skill.domain.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListStretchingConverter
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListWarmUpConverter
import vigor.fitness.calisthenicsmaster.core.domain.entities.ProgressState
import vigor.fitness.calisthenicsmaster.core.domain.entities.WarmUp
import vigor.fitness.calisthenicsmaster.core.domain.entities.Stretching

@Entity
@TypeConverters(
    ListWarmUpConverter::class,
    ListStretchingConverter::class
)
data class Progression(
    @PrimaryKey
    val id: Int,
    val name: String,
    val level: Int,
    @Embedded(prefix = "progressState_")
    val progressState: ProgressState,
    val goal: Int,
    val description: String,
    val warmUp: List<WarmUp>,
    val stretching: List<Stretching>
)