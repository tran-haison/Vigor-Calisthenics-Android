package vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local

import androidx.room.Database
import androidx.room.RoomDatabase
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.daos.SkillDao
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

@Database(
    entities = [
        Skill::class,
        Progression::class,
        Plan::class
    ],
    version = 1
)
abstract class SkillDatabase : RoomDatabase() {

    abstract val skillDao: SkillDao

    companion object {
        const val SKILL_DATABASE_NAME = "skills.db"
    }
}