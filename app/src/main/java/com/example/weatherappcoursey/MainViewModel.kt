package com.example.weatherappcoursey

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherappcoursey.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()

}