package vigor.fitness.calisthenicsmaster.features.exercise.data.models

import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise

data class ExerciseModel(
    val name: String,
    val description: String,
    val dynamicExercise: Boolean,
    val titlePic: String,
    val exercisePic: String,
    val exercisePicDark: String,
    val muscles: String,
    val musclesIcons: List<String>,
    val video: String,
    val videoURL: String,
    val videoStart: Int,
    val videoEnd: Int,
    val difficulty: String,
    val unilateral: Boolean,
    val techniqueSummary: String,
    val exercisePic2: String? = null
) {
    fun modelToEntity(): Exercise {
        return Exercise(
            name = this.name,
            description = this.description,
            dynamicExercise = this.dynamicExercise,
            titlePic = this.titlePic,
            exercisePic = this.exercisePic,
            exercisePicDark = this.exercisePicDark,
            muscles = this.muscles,
            musclesIcons = this.musclesIcons,
            video = this.video,
            videoURL = this.videoURL,
            videoStart = this.videoStart,
            videoEnd = this.videoEnd,
            difficulty = this.difficulty,
            unilateral = this.unilateral,
            techniqueSummary = this.techniqueSummary,
            exercisePic2 = this.exercisePic2,
        )
    }
}