package com.udec.ordinarioexamen.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var api = Retrofit
    .Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl("https://www.fishwatch.gov/api/species")
    .build()
