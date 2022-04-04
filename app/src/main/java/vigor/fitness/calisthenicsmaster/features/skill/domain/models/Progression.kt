package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class Progression(
    @SerializedName("name")
    val name: String,
    @SerializedName("level")
    val level: Int,
    @SerializedName("progressState")
    val progressState: ProgressState,
    @SerializedName("goal")
    val goal: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("warmUp")
    val warmUp: List<WarmUp>,
    @SerializedName("stretching")
    val stretching: List<Stretching>,
    @SerializedName("plan")
    val plan: List<Plan>
)