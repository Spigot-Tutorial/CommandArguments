package me.shalckercraft.commandarguments.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RepeatCMD implements CommandExecutor {

    // /repeat bob is really cool

    // args[0] - bob
    // args[1] - is
    // args[2] really
    // args[4] cool
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length == 0) {
                p.sendMessage("You did not provide any arguments when running the command. Try again.");
                p.sendMessage("Example: /repeat <message here>");
            } else if (args.length == 1) {
                String world = args[0];

                p.sendMessage("Message: " + world);

            } else {

                StringBuilder builder = new StringBuilder();

                for (int i = 0; i < args.length; i++) {
                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.trim();

                p.sendMessage("Here is a big boi message: " + finalMessage);

            }
        }


        return true;
    }
}
