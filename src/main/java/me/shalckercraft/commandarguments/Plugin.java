package me.shalckercraft.commandarguments;

import me.shalckercraft.commandarguments.commands.FartCMD;
import me.shalckercraft.commandarguments.commands.RepeatCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("repeat").setExecutor(new RepeatCMD());
        getCommand("fart").setExecutor(new FartCMD());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
