package me.dio.copa.catar.remote.services

import me.dio.copa.catar.remote.model.MatchRemote
import retrofit2.http.GET

interface MatchesServices {
    @GET("https://raw.githubusercontent.com/mayconeves/dio-copa-do-mundo-2022-api/main/api.json")
    suspend fun getMatches(): List<MatchRemote>
}
