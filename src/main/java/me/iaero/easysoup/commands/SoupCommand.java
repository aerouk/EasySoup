package me.iaero.easysoup.commands;

import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SoupCommand implements CommandExecutor
{
    public ItemStack soup()
    {
        return (new ItemStack(Material.MUSHROOM_SOUP));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player)
        {
            Player player = (Player)sender;

            if (player.hasPermission("easysoup.soup") || player.isOp())
            {
                for (int i = 0; i < 8; i++)
                {
                    player.getInventory().addItem(soup());
                }

                player.sendMessage("§aYour soup has been refilled.");
                return true;
            }
            else
            {
                player.sendMessage("§cYou do not have permission to execute this command!");
            }
        }
        else
        {
            sender.sendMessage("§cPlease use this command in-game.");
        }

        return false;
    }
}
