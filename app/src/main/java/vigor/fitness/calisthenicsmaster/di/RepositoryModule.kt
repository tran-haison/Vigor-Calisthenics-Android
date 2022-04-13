package vigor.fitness.calisthenicsmaster.di

import org.koin.dsl.module
import vigor.fitness.calisthenicsmaster.features.exercise.data.repositories.ExerciseRepositoryImpl
import vigor.fitness.calisthenicsmaster.features.exercise.domain.repositories.ExerciseRepository
import vigor.fitness.calisthenicsmaster.features.routine.data.repositories.RoutineRepositoryImpl
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository


val repoModule = module {
    single<ExerciseRepository> { ExerciseRepositoryImpl(get()) }
    single<RoutineRepository> { RoutineRepositoryImpl(get()) }
}