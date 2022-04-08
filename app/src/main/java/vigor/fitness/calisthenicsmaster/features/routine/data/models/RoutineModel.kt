package vigor.fitness.calisthenicsmaster.features.routine.data.models


import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.SkillState

data class RoutineModel(
    val id: Int,
    val belongingRoutineIDs: List<Int>,
    val name: String,
    val exercisePic: String,
    val exercisePicDark: String,
    val dynamicExercise: Boolean,
    val video: String,
    val videoURL: String,
    val videoStart: Int,
    val videoEnd: Int,
    val muscles: String,
    val musclesIcons: List<String>,
    val difficulty: String,
    val techniqueSummary: String,
    val description: String,
    val routine: Boolean,
    val skillPic: String,
    val titlePic: String,
    val skillState: SkillState,
    val progressions: List<Progression>,
    val progress: Int? = null,
) {
    fun modelToEntity(): Routine {
        return Routine(
            id = this.id,
            belongingRoutineIDs = this.belongingRoutineIDs,
            name = this.name,
            exercisePic = this.exercisePic,
            exercisePicDark = this.exercisePicDark,
            dynamicExercise = this.dynamicExercise,
            video = this.video,
            videoURL = this.videoURL,
            videoStart = this.videoStart,
            videoEnd = this.videoEnd,
            muscles = this.muscles,
            musclesIcons = this.musclesIcons,
            difficulty = this.difficulty,
            techniqueSummary = this.techniqueSummary,
            description = this.description,
            routine = this.routine,
            skillPic = this.skillPic,
            titlePic = this.titlePic,
            skillID = this.skillState.skillID,
            progressionListId = this.progressions.map { it.id },
            progress = this.progress,
        )
    }
}