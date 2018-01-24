package me.iaero.easysoup.util;

import org.bukkit.ChatColor;

/**
 * Utility class for chat manipulation.
 *
 * @author aerouk
 */
public class Chat
{
    /**
     * Convert the '&' characters in a string to the ChatColor colour char, colouring a message.
     *
     * @param msg Message to convert colour codes for
     * @return Message with & colour codes converted
     */
    public static String color(String msg)
    {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
