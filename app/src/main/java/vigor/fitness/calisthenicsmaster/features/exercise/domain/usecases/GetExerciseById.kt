package vigor.fitness.calisthenicsmaster.features.exercise.domain.usecases

import vigor.fitness.calisthenicsmaster.features.exercise.domain.models.Exercise
import vigor.fitness.calisthenicsmaster.features.exercise.domain.repositories.ExerciseRepository

class GetExerciseById(
    private val _exerciseRepository: ExerciseRepository
) {

    suspend operator fun invoke(id: Int): Exercise? {
        return _exerciseRepository.getExerciseById(id)
    }
}