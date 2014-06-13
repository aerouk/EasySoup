package me.iaero.easysoup.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatHelper {
    
    /**
     * Sends a message to the specified player with '&' colour codes
     * translated.
     *
     * @param player player to send the message to
     * @param message message to send to the player
     */
    public void sendColorMessage(Player player, String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
    
    /**
     * Sends a message to the specified CommandSender with '&' colour codes
     * translated.
     *
     * @param sender sender to send the message to
     * @param message message to send to the sender
     */
    public void sendColorMessage(CommandSender sender, String message) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

}
