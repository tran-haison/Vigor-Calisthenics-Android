package vigor.fitness.calisthenicsmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vigor.fitness.calisthenicsmaster.core.utils.converter.JsonConverter
import vigor.fitness.calisthenicsmaster.core.utils.log.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonConverter = JsonConverter(this)
        val routineList = jsonConverter.getExercisesList()
        log { routineList[0].musclesIcons.toString() }
    }
}