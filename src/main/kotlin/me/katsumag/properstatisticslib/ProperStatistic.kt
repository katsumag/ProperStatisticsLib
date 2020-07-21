package me.katsumag.properstatisticslib

import org.bukkit.plugin.java.JavaPlugin

class ProperStatistic(private val type: Any, private val listener: StatisticListener, private val plugin: JavaPlugin) {

    init {
        StatisticsManager.registerStatistic(this)
    }

    private var amount = 0

    fun getAmount() = amount

    fun decrement() = amount--

    fun increment() = amount++

    fun getProvider() = listener

    fun getType() = type

    fun getPlugin() = plugin

}