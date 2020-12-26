package me.dkim19375.updatecheckerapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class UpdateCheckerAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        printToConsole("Starting up " + getDescription().getName() + " version " + getDescription().getVersion() + "!");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }

    public void printToConsole(String msg) {
        this.getServer().getConsoleSender().sendMessage("[" + getDescription().getName() + "] " + msg);
        printToConsole("Disabling " + getDescription().getName() + " version " + getDescription().getVersion() + "!");
    }
}
