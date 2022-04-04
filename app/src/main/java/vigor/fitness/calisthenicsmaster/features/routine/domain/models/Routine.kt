package vigor.fitness.calisthenicsmaster.features.routine.domain.models


import com.google.gson.annotations.SerializedName

data class Routine(
    @SerializedName("id")
    val id: Int,
    @SerializedName("belongingRoutineIDs")
    val belongingRoutineIDs: List<Int>,
    @SerializedName("name")
    val name: String,
    @SerializedName("exercisePic")
    val exercisePic: String,
    @SerializedName("exercisePicDark")
    val exercisePicDark: String,
    @SerializedName("dynamicExercise")
    val dynamicExercise: Boolean,
    @SerializedName("video")
    val video: String,
    @SerializedName("videoURL")
    val videoURL: String,
    @SerializedName("videoStart")
    val videoStart: Int,
    @SerializedName("videoEnd")
    val videoEnd: Int,
    @SerializedName("muscles")
    val muscles: String,
    @SerializedName("musclesIcons")
    val musclesIcons: List<String>,
    @SerializedName("difficulty")
    val difficulty: String,
    @SerializedName("techniqueSummary")
    val techniqueSummary: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("routine")
    val routine: Boolean,
    @SerializedName("skillPic")
    val skillPic: String,
    @SerializedName("titlePic")
    val titlePic: String,
    @SerializedName("skillState")
    val skillState: SkillState,
    @SerializedName("progressions")
    val progressions: List<Progression>,
    @SerializedName("progress")
    val progress: Int? = null,
)