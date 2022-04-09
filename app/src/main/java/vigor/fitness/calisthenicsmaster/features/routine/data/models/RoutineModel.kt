package vigor.fitness.calisthenicsmaster.features.routine.data.models


import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

data class RoutineModel(
    val id: Int,
    val belongingRoutineIDs: List<Int>,
    val name: String,
    val exercisePic: String,
    val exercisePicDark: String,
    val progress: Int,
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
    val skillState: SkillStateModel,
    val progressions: List<ProgressionModel>,
) {
    fun toEntity(): Routine {
        return Routine(
            id = this.id,
            belongingRoutineIDs = this.belongingRoutineIDs,
            name = this.name,
            exercisePic = this.exercisePic,
            exercisePicDark = this.exercisePicDark,
            progress = this.progress,
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
        )
    }
}