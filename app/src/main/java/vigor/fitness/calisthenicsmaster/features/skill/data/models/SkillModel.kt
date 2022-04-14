package vigor.fitness.calisthenicsmaster.features.skill.data.models


import vigor.fitness.calisthenicsmaster.core.data.models.SkillStateModel
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

data class SkillModel(
    val id: Int,
    val belongingRoutineIDs: List<Int>,
    val name: String,
    val description: String,
    val routine: Boolean,
    val skillPic: String,
    val titlePic: String,
    val skillState: SkillStateModel,
    val progressions: List<Progression>
) {
    fun toEntity(): Skill {
        return Skill(
            id = this.id,
            belongingRoutineIDs = this.belongingRoutineIDs,
            name = this.name,
            description = this.description,
            routine = this.routine,
            skillPic = this.skillPic,
            titlePic = this.titlePic,
            skillState = this.skillState.toEntity(),
        )
    }
}