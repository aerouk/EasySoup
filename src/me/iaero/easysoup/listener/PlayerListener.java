package me.iaero.easysoup.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Player listener class, handling the consumption of soup to regain health up to 20.
 *
 * @author aerouk
 */
public class PlayerListener implements Listener
{
    @EventHandler
    public void soupEvent(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        Action action = event.getAction();
        
        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().getType() == Material.MUSHROOM_SOUP) {
                if (player.getHealth() < 20.0 && player.getHealth() + 1.0 <= 20.0) {
                    double toHeal = player.getHealth() + 7.0 > 20.0 ? 20.0 : player.getHealth() + 7.0;

                    player.setHealth(toHeal);
                    player.getInventory().setItemInMainHand(new ItemStack(Material.BOWL));
                    
                    event.setCancelled(true);
                }
            }
        }
    }
}
