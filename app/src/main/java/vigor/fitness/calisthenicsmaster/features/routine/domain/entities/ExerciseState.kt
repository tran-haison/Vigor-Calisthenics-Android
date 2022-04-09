package vigor.fitness.calisthenicsmaster.features.routine.domain.entities

data class ExerciseState(
    val record: Int,
    val lastSetResult: List<Int>
)