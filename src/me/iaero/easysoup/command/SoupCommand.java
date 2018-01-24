package me.iaero.easysoup.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.iaero.easysoup.util.Chat;

/**
 * Command executor to handle the /soup command, giving the player 8 soup.
 *
 * @author aerouk
 */
public class SoupCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String tag, String[] args)
    {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            
            if (player.hasPermission("easysoup.soup") || player.isOp()) {
                for (int i = 0; i < 8; i++) {
                    player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
                }
                
                player.sendMessage(Chat.color("&aYour soup has been refilled."));
            } else {
                player.sendMessage(Chat.color("&cYou don't have permission to use this command."));
            }
        } else {
            sender.sendMessage(Chat.color("&cThis command is for players only."));
        }
        
        return true;
    }
}
