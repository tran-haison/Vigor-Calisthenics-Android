package vigor.fitness.calisthenicsmaster.features.exercise.data.repositories

import kotlinx.coroutines.flow.Flow
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.ExerciseLocalDatasource
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise
import vigor.fitness.calisthenicsmaster.features.exercise.domain.repositories.ExerciseRepository
import javax.inject.Inject

class ExerciseRepositoryImpl(
    private val _exerciseLocalDatasource: ExerciseLocalDatasource
) : ExerciseRepository {

    override suspend fun insertExercise(exercise: Exercise) {
        return _exerciseLocalDatasource.insertExercise(exercise)
    }

    override suspend fun insertExerciseList(exerciseList: List<Exercise>) {
        return _exerciseLocalDatasource.insertExerciseList(exerciseList)
    }

    override suspend fun getExerciseById(id: Int): Exercise? {
        return _exerciseLocalDatasource.getExerciseById(id)
    }

    override fun getAllExercises(): Flow<List<Exercise>> {
        return _exerciseLocalDatasource.getAllExercises()
    }
}