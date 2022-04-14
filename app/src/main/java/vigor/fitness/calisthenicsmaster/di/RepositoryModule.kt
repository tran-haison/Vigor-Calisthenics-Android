package vigor.fitness.calisthenicsmaster.di

import org.koin.dsl.module
import vigor.fitness.calisthenicsmaster.features.exercise.data.repositories.ExerciseRepositoryImpl
import vigor.fitness.calisthenicsmaster.features.exercise.domain.repositories.ExerciseRepository
import vigor.fitness.calisthenicsmaster.features.routine.data.repositories.RoutineRepositoryImpl
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository
import vigor.fitness.calisthenicsmaster.features.skill.data.repositories.SkillRepositoryImpl
import vigor.fitness.calisthenicsmaster.features.skill.domain.repositories.SkillRepository


val repoModule = module {
    single<ExerciseRepository> { return@single ExerciseRepositoryImpl(get()) }
    single<RoutineRepository> { return@single RoutineRepositoryImpl(get()) }
    single<SkillRepository> { return@single SkillRepositoryImpl(get()) }
}