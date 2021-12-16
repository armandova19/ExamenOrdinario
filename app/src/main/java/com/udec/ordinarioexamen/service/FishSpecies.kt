package com.udec.ordinarioexamen.service

import com.udec.ordinarioexamen.api.Response
import com.udec.ordinarioexamen.api.api
import com.udec.ordinarioexamen.models.Fish
import retrofit2.http.GET

interface FishSpecies {
    @GET("?")
    suspend fun getFish(): Response<MutableList<Fish>>

}
var fish: FishSpecies = api.create<FishSpecies>(FishSpecies::class.java)