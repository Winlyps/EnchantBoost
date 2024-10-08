package winlyps.enchantBoost

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.enchantment.EnchantItemEvent
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class EnchantEventListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onEnchantItem(event: EnchantItemEvent) {
        val player: Player = event.enchanter
        applyGlowEffect(player)
    }

    private fun applyGlowEffect(player: Player) {
        player.addPotionEffect(PotionEffect(PotionEffectType.GLOWING, 15 * 20, 0, false, false, false))
    }
}