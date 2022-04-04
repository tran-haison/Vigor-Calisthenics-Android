package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class Skill(
    @SerializedName("id")
    val id: Int,
    @SerializedName("belongingRoutineIDs")
    val belongingRoutineIDs: List<Int>,
    @SerializedName("name")
    val name: String,
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
    val progressions: List<Progression>
)