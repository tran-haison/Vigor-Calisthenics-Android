package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListStretchingConverter
import vigor.fitness.calisthenicsmaster.core.utils.converter.ListWarmUpConverter
import vigor.fitness.calisthenicsmaster.features.routine.data.models.WarmUpModel

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
    val goal: Int,
    val goalText: String,
    @Embedded(prefix = "progressState_")
    val progressState: ProgressState,
    val warmUp: List<WarmUp>,
    val stretching: List<Stretching>
)