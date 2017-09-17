package pl.hypeapp.dataproviders.datasource

import io.reactivex.Single
import pl.hypeapp.dataproviders.entity.api.AllSeasonsEntity
import pl.hypeapp.dataproviders.entity.api.MostPopularEntity
import pl.hypeapp.dataproviders.entity.api.TopListEntity
import pl.hypeapp.dataproviders.entity.api.TvShowEntity
import pl.hypeapp.domain.model.PageableRequest

interface TvShowDataStore {

    fun getTvShow(tvShowId: String, update: Boolean): Single<TvShowEntity>

    fun getMostPopular(pageableRequest: PageableRequest, update: Boolean): Single<MostPopularEntity>

    fun getTopList(pageableRequest: PageableRequest, update: Boolean): Single<TopListEntity>

    fun getAllSeasons(tvShowId: String, update: Boolean): Single<AllSeasonsEntity>

}
