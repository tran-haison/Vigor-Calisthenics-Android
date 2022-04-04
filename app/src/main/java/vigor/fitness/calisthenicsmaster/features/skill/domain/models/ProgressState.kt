package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class ProgressState(
    @SerializedName("finished")
    val finished: Boolean,
    @SerializedName("currentProgress")
    val currentProgress: Boolean,
    @SerializedName("status")
    val status: Double
)