package vigor.fitness.calisthenicsmaster.core.data.datasources.prefdatastore

interface PrefDataStore {

    suspend fun saveValue()

    suspend fun getValue()
}