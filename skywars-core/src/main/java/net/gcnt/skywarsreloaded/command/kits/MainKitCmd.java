package net.gcnt.skywarsreloaded.command.kits;

import net.gcnt.skywarsreloaded.SkyWarsReloaded;
import net.gcnt.skywarsreloaded.command.Cmd;
import net.gcnt.skywarsreloaded.command.SWCommand;
import net.gcnt.skywarsreloaded.utils.properties.MessageProperties;
import net.gcnt.skywarsreloaded.wrapper.SWCommandSender;

public class MainKitCmd extends Cmd {

    public MainKitCmd(SkyWarsReloaded plugin) {
        super(plugin, "skywarskit", "", "skywars.command.kit.main", false, null, "Get a list of commands.");
    }

    @Override
    public boolean run(SWCommandSender sender, String[] args) {
        // sending header.
        sender.sendMessage(plugin.getUtils().colorize(plugin.getMessages().getString(MessageProperties.CHAT_HEADER.toString())));

        // Sending stuff
        for (SWCommand cmd : plugin.getCommandManager().getCommands("skywarskit")) {
            // Permission check
            if (!sender.hasPermission(cmd.getPermission())) continue;

            sender.sendMessage(cmd.sendUsage(sender, false));
        }
        return true;
    }
}
