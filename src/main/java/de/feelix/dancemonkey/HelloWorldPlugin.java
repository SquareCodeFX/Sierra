package de.feelix.dancemonkey;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello World! Plugin has been enabled successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Hello World Plugin has been disabled!");
    }
}
