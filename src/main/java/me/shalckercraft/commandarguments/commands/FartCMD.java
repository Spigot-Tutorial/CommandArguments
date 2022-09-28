package me.shalckercraft.commandarguments.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /fart <PlayerName>

        if (sender instanceof Player p) {

            if (args.length == 0) {
                p.sendMessage("You are so nasty. You hava just farted all over yourself. Get yourself together man.");
                p.setHealth(0.0);
            } else {

                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null) {
                    p.sendMessage("This player is not online.");
                } else {

                    p.sendMessage("You successfully farted on " + target.getDisplayName());
                    target.sendMessage("You hava just been farted on " + target.getDisplayName() + ". How does that make feel?");
                    target.setHealth(0.0);

                }
            }
        }

        return true;
    }
}
