package vigor.fitness.calisthenicsmaster.core.utils.log

import timber.log.Timber


inline fun log(message: () -> String) {
    Timber.d(message())
}

inline fun logError(message: () -> String) {
    Timber.e(message())
}