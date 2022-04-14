package vigor.fitness.calisthenicsmaster.di

import org.koin.dsl.module
import vigor.fitness.calisthenicsmaster.features.exercise.domain.usecases.GetAllExercisesUC
import vigor.fitness.calisthenicsmaster.features.exercise.domain.usecases.GetExerciseByIdUC
import vigor.fitness.calisthenicsmaster.features.routine.domain.usecases.RoutineInsertPlanListUC
import vigor.fitness.calisthenicsmaster.features.routine.domain.usecases.RoutineInsertProgressionListUC
import vigor.fitness.calisthenicsmaster.features.routine.domain.usecases.RoutineInsertRoutineListUC
import vigor.fitness.calisthenicsmaster.features.skill.domain.usecases.SkillInsertPlanListUC
import vigor.fitness.calisthenicsmaster.features.skill.domain.usecases.SkillInsertProgressionListUC
import vigor.fitness.calisthenicsmaster.features.skill.domain.usecases.SkillInsertSkillListUC


val useCaseModule = module {

    // Exercise
    factory { GetAllExercisesUC(get()) }
    factory { GetExerciseByIdUC(get()) }

    // Routine
    factory { RoutineInsertPlanListUC(get()) }
    factory { RoutineInsertProgressionListUC(get()) }
    factory { RoutineInsertRoutineListUC(get()) }

    // Skill
    factory { SkillInsertPlanListUC(get()) }
    factory { SkillInsertProgressionListUC(get()) }
    factory { SkillInsertSkillListUC(get()) }
}