package vigor.fitness.calisthenicsmaster.features.routine.domain.usecases

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository

class RoutineInsertPlanListUC(
    private val _routineRepository: RoutineRepository
) {

    suspend operator fun invoke(list: List<Plan>) {
        return _routineRepository.insertPlanList(list)
    }
}