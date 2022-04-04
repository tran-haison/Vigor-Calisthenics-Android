package vigor.fitness.calisthenicsmaster.features.routine.domain.models


import com.google.gson.annotations.SerializedName

data class SkillState(
    @SerializedName("skillID")
    val skillID: Int,
    @SerializedName("currentProgress")
    val currentProgress: Int,
    @SerializedName("progress")
    val progress: Double
)