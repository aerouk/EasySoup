package me.iaero.easysoup.commands;

import me.iaero.easysoup.EasySoup;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SoupCommand implements CommandExecutor {

    public ItemStack soup() {
        return (new ItemStack(Material.MUSHROOM_SOUP));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("easysoup.soup") || player.isOp()) {
                for (int i = 0; i < 8; i++) {
                    player.getInventory().addItem(soup());
                }

                EasySoup.chat.sendColorMessage(player, "&aYour soup has been refilled.");
                return true;
            } else {
                EasySoup.chat.sendColorMessage(player, "&cYou do not have permission to execute this command!");
            }
        } else {
            EasySoup.chat.sendColorMessage(sender, "&cPlease use this command in-game.");
        }

        return false;
    }

}
