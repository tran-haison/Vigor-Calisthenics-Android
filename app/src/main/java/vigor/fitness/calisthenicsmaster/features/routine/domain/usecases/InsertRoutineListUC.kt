package vigor.fitness.calisthenicsmaster.features.routine.domain.usecases

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository

class InsertRoutineListUC(
    private val _routineRepository: RoutineRepository
) {

    suspend operator fun invoke(list: List<Routine>) {
        return _routineRepository.insertRoutineList(list)
    }
}