package me.katsumag.properstatisticslib

import org.bukkit.Bukkit

object StatisticsManager {

    private val registeredStatistics = mutableListOf<ProperStatistic>()

    fun registerStatistic(stat: ProperStatistic) {
        registeredStatistics.add(stat)
        Bukkit.getServer().pluginManager.registerEvents(stat.getProvider(), stat.getPlugin())
    }

    fun getRegisteredStatistics() = listOf(registeredStatistics)

}