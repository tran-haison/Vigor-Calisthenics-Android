package vigor.fitness.calisthenicsmaster.core.utils.log

import android.util.Log
import vigor.fitness.calisthenicsmaster.BuildConfig


inline fun Any.log(message: () -> String) {
    if (BuildConfig.DEBUG) {
        Log.d(this.javaClass.simpleName, message())
    }
}

inline fun Any.logError(message: () -> String?) {
    if (BuildConfig.DEBUG) {
        Log.e(this.javaClass.simpleName, message())
    }
}