package me.katsumag.properstatisticslib

import org.bukkit.plugin.java.JavaPlugin

class ProperStatistic(val type: Any, val listener: StatisticListener, val plugin: JavaPlugin) {

    init {
        StatisticsManager.registerStatistic(this)
    }

    var amount = 0

    fun decrement() = amount--

    fun increment() = amount++

}