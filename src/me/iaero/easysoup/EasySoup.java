package me.iaero.easysoup;

import org.bukkit.plugin.java.JavaPlugin;

import me.iaero.easysoup.command.SoupCommand;
import me.iaero.easysoup.listener.PlayerListener;

/**
 * EasySoup, allowing players to use mushroom soup as a means of additional health.
 *
 * @author aerouk
 */
public class EasySoup extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("soup").setExecutor(new SoupCommand());
        
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
}
