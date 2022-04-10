package vigor.fitness.calisthenicsmaster.features.exercise.domain.usecases

import kotlinx.coroutines.flow.Flow
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise
import vigor.fitness.calisthenicsmaster.features.exercise.domain.repositories.ExerciseRepository

class GetAllExercisesUC(
    private val _exerciseRepository: ExerciseRepository
) {

    operator fun invoke() : Flow<List<Exercise>> {
        return _exerciseRepository.getAllExercises()
    }
}