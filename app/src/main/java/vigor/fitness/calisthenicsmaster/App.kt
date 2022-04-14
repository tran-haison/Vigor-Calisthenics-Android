package vigor.fitness.calisthenicsmaster

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber
import vigor.fitness.calisthenicsmaster.core.utils.constant.GLOBAL_TAG
import vigor.fitness.calisthenicsmaster.di.appModule
import vigor.fitness.calisthenicsmaster.di.repoModule
import vigor.fitness.calisthenicsmaster.di.useCaseModule
import vigor.fitness.calisthenicsmaster.di.viewModelModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // Setup DI
        setupDI()

        // Setup log
        setupLogDebug()
    }

    private fun setupDI() {
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(appModule, repoModule, useCaseModule, viewModelModule))
        }
    }

    private fun setupLogDebug() {
        val formatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(true)
            .methodCount(1)
            .methodOffset(5)
            .tag(GLOBAL_TAG)
            .build()

        Logger.addLogAdapter(object : AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })

        Timber.plant(object : Timber.DebugTree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                Logger.log(priority, tag, message, t)
            }
        })
    }
}