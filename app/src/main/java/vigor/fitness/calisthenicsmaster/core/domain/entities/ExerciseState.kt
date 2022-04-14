package vigor.fitness.calisthenicsmaster.core.domain.entities

data class ExerciseState(
    val record: Int,
    val lastSetResult: List<Int>
)