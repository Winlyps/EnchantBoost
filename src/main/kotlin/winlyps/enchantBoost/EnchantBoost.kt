package winlyps.enchantBoost

import org.bukkit.plugin.java.JavaPlugin

class EnchantBoost : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(EnchantEventListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}