package vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local

import kotlinx.coroutines.flow.Flow
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.ExerciseLocalDatasource
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.daos.ExerciseDao
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise
import javax.inject.Inject

class ExerciseLocalDatasourceImpl(
    private val _exerciseDao: ExerciseDao
) : ExerciseLocalDatasource {

    override suspend fun insertExercise(exercise: Exercise) {
        return _exerciseDao.insertExercise(exercise)
    }

    override suspend fun insertExerciseList(exerciseList: List<Exercise>) {
        return _exerciseDao.insertExerciseList(exerciseList)
    }

    override suspend fun getExerciseById(id: Int): Exercise? {
        return _exerciseDao.getExerciseById(id)
    }

    override fun getAllExercises(): Flow<List<Exercise>> {
        return _exerciseDao.getAllExercises()
    }
}