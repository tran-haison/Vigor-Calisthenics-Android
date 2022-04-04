package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class ExerciseState(
    @SerializedName("record")
    val record: Int,
    @SerializedName("lastSetResult")
    val lastSetResult: List<Int>
)