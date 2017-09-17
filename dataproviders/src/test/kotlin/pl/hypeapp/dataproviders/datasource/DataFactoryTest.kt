package pl.hypeapp.dataproviders.datasource

import org.amshove.kluent.`should be instance of`
import org.amshove.kluent.`should not be`
import org.amshove.kluent.mock
import org.junit.Before
import org.junit.Test
import pl.hypeapp.dataproviders.cache.CacheProviders
import pl.hypeapp.dataproviders.cache.EvictCache
import pl.hypeapp.dataproviders.service.api.ApiService
import pl.hypeapp.dataproviders.service.room.RoomService

class DataFactoryTest {

    private lateinit var dataFactory: DataFactory

    private val apiService: ApiService = mock()

    private val cacheProviders: CacheProviders = mock()

    private val evictCache: EvictCache = mock()

    private val roomService: RoomService = mock()

    @Before
    fun setUp() {
        dataFactory = DataFactory(apiService, cacheProviders, evictCache, roomService)
    }

    @Test
    fun `should create tv show data store`() {
        val tvShowDataStore: TvShowDataStore = dataFactory.createTvShowDataSource()
        tvShowDataStore `should not be` null
        tvShowDataStore `should be instance of` TvShowDataStore::class.java
    }

    @Test
    fun `should create watched data store`() {
        val watchedDataStore: WatchedDataStore = dataFactory.createWatchedDataSource()
        watchedDataStore `should not be` null
        watchedDataStore `should be instance of` WatchedDataStore::class.java
    }

    @Test
    fun `should create runtime data store`() {
        val runtimeDataStore: RuntimeDataStore = dataFactory.createRuntimeDataSource()
        runtimeDataStore `should not be` null
        runtimeDataStore `should be instance of` RuntimeDataStore::class.java
    }

}
