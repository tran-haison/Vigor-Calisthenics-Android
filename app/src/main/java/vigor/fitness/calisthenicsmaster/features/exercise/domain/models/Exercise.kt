package vigor.fitness.calisthenicsmaster.features.exercise.domain.models

import com.google.gson.annotations.SerializedName

data class Exercise(

    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("dynamicExercise")
    val dynamicExercise: Boolean,
    @SerializedName("titlePic")
    val titlePic: String,
    @SerializedName("exercisePic")
    val exercisePic: String,
    @SerializedName("exercisePicDark")
    val exercisePicDark: String,
    @SerializedName("muscles")
    val muscles: String,
    @SerializedName("musclesIcons")
    val musclesIcons: List<String>,
    @SerializedName("video")
    val video: String,
    @SerializedName("videoURL")
    val videoURL: String,
    @SerializedName("videoStart")
    val videoStart: Int,
    @SerializedName("videoEnd")
    val videoEnd: Int,
    @SerializedName("difficulty")
    val difficulty: String,
    @SerializedName("unilateral")
    val unilateral: Boolean,
    @SerializedName("techniqueSummary")
    val techniqueSummary: String,
    @SerializedName("exercisePic2")
    val exercisePic2: String? = null
)