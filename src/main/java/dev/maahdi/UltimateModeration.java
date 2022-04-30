package dev.maahdi;

import dev.maahdi.commands.CommandHandler;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class UltimateModeration extends JavaPlugin {
    public CommandHandler commandHandler;
    @Override
    public void onEnable() {
        loadFiles();
        System.out.println("Plugin has started");
        commandHandler = new CommandHandler(this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin has Stopped");
    }

    public FileConfiguration getDefaultConfig(){
        return this.getConfig();
    }
    public void loadFiles(){
        this.saveDefaultConfig();
        this.reloadConfig();
    }
    public Object get_Value(String path){
        return getDefaultConfig().get(path);
    }
}
