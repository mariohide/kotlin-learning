package com.example.kdl.weather.domain.model

data class ForeCastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
//    val size: Int get() = dailyForecast.size
//    operator fun get(position: Int) = dailyForecast[position]
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)