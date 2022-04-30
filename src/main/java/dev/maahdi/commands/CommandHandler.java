package dev.maahdi.commands;

import dev.maahdi.UltimateModeration;

public class CommandHandler {
    AddWordCommand addWordCommand = new AddWordCommand();
    removewordCommand removewordCommand = new removewordCommand();
    blacklistPlayerCommand blacklistPlayerCommand = new blacklistPlayerCommand();
    reloadCommand reloadCommand = new reloadCommand();

    private final UltimateModeration plugin;
    public CommandHandler(UltimateModeration plugin){
        this.plugin = plugin;
        RegisterCommands(plugin);
    }

    public void RegisterCommands(UltimateModeration plugin){
        plugin.getServer().getPluginCommand("addword").setExecutor(addWordCommand);
        plugin.getServer().getPluginCommand("removeword").setExecutor(removewordCommand);
        plugin.getServer().getPluginCommand("addplayer").setExecutor(blacklistPlayerCommand);
        plugin.getServer().getPluginCommand("mreload").setExecutor(reloadCommand);
    }
}
