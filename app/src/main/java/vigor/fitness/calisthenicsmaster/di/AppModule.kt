package vigor.fitness.calisthenicsmaster.di

import android.content.Context
import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.ExerciseLocalDatasource
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.ExerciseDatabase
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.ExerciseLocalDatasourceImpl
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.daos.ExerciseDao
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.RoutineLocalDatasource
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.RoutineDatabase
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.RoutineLocalDatasourceImpl
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.daos.RoutineDao
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.SkillLocalDatasource
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.SkillDatabase
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.SkillLocalDatasourceImpl
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.daos.SkillDao


val appModule = module {
    // Databases
    single { provideExerciseDatabase(androidContext()) }
    single { provideRoutineDatabase(androidContext()) }
    single { provideSkillDatabase(androidContext()) }

    // Daos
    single { provideExerciseDao(get()) }
    single { provideRoutineDao(get()) }
    single { provideSkillDao(get()) }

    // Data sources
    single<ExerciseLocalDatasource> { return@single ExerciseLocalDatasourceImpl(get()) }
    single<RoutineLocalDatasource> { return@single RoutineLocalDatasourceImpl(get()) }
    single<SkillLocalDatasource> { return@single SkillLocalDatasourceImpl(get()) }
}

// Provide databases
private fun provideExerciseDatabase(context: Context): ExerciseDatabase {
    return Room.databaseBuilder(
        context,
        ExerciseDatabase::class.java,
        ExerciseDatabase.EXERCISE_DATABASE_NAME,
    ).build()
}
private fun provideRoutineDatabase(context: Context): RoutineDatabase {
    return Room.databaseBuilder(
        context,
        RoutineDatabase::class.java,
        RoutineDatabase.ROUTINE_DATABASE_NAME,
    ).build()
}
private fun provideSkillDatabase(context: Context): SkillDatabase {
    return Room.databaseBuilder(
        context,
        SkillDatabase::class.java,
        SkillDatabase.SKILL_DATABASE_NAME,
    ).build()
}

// Provide daos
private fun provideExerciseDao(exerciseDatabase: ExerciseDatabase): ExerciseDao {
    return exerciseDatabase.exerciseDao
}
private fun provideRoutineDao(routineDatabase: RoutineDatabase): RoutineDao {
    return routineDatabase.routineDao
}
private fun provideSkillDao(skillDatabase: SkillDatabase): SkillDao {
    return skillDatabase.skillDao
}




