package vigor.fitness.calisthenicsmaster.features.exercise.data.datasources

import kotlinx.coroutines.flow.Flow
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise

interface ExerciseLocalDatasource {
    suspend fun insertExercise(exercise: Exercise)
    suspend fun insertExerciseList(exerciseList: List<Exercise>)
    suspend fun getExerciseById(id: Int): Exercise?
    fun getAllExercises(): Flow<List<Exercise>>
}