package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(

)
data class Progression(
    @PrimaryKey(autoGenerate = true)
    @Transient
    val id: Int,
    val name: String,
    val level: Int,
    val goal: Int,
    val goalText: String,
    @SerializedName("progressState")
    val progressState: ProgressState,
    @SerializedName("warmUp")
    val warmUp: List<WarmUp>,
    @SerializedName("stretching")
    val stretching: List<Stretching>,
    @SerializedName("plan")
    val plan: List<Plan>
)