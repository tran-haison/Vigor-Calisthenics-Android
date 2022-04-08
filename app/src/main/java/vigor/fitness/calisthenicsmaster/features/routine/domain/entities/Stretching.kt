package vigor.fitness.calisthenicsmaster.features.routine.domain.entities


import com.google.gson.annotations.SerializedName

data class Stretching(
    @SerializedName("name")
    val name: String,
    @SerializedName("beat")
    val beat: Int
)