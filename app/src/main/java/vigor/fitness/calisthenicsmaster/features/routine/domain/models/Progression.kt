package vigor.fitness.calisthenicsmaster.features.routine.domain.models


import com.google.gson.annotations.SerializedName

data class Progression(
    @SerializedName("name")
    val name: String,
    @SerializedName("level")
    val level: Int,
    @SerializedName("goal")
    val goal: Int,
    @SerializedName("goalText")
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