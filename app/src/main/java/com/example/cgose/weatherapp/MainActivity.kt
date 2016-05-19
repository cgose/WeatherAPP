package com.example.cgose.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

  private val items = listOf(
    "Mon 6/23 - Sunny - 31/17",
    "Tue 6/24 - Foggy - 31/17",
    "Wed 6/25 - Cloudy - 31/17",
    "Thu 6/26 - Rainy - 31/17",
    "Fri 6/27 - Foggy - 31/17",
    "Sat 6/28 - TRAPPED IN WEATHER STATION - 31/17",
    "Sun 6/29 - Sunny - 31/17"
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val forecastList = findViewById(R.id.forecast_list) as RecyclerView
    forecastList.layoutManager = LinearLayoutManager(this)
    forecastList.adapter = ForecastListAdapter(items)
  }
}
