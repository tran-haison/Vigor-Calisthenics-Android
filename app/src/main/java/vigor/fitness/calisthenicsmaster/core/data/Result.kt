package vigor.fitness.calisthenicsmaster.core.data

sealed class Result<T>(
    val data: T? = null,
    val message: String? = null,
    val code: String? = null,
) {
    class Success<T>(data: T) : Result<T>(data)
    class Error<T>(data: T? = null, message: String, code: String) : Result<T>(data, message, code)
    class Loading<T>(data: T? = null) : Result<T>(data)
}
