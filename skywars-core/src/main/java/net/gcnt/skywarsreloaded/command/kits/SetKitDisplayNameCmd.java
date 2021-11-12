package net.gcnt.skywarsreloaded.command.kits;

import net.gcnt.skywarsreloaded.SkyWarsReloaded;
import net.gcnt.skywarsreloaded.command.Cmd;
import net.gcnt.skywarsreloaded.game.GameTemplate;
import net.gcnt.skywarsreloaded.game.kits.SWKit;
import net.gcnt.skywarsreloaded.wrapper.SWCommandSender;

import java.util.Arrays;

public class SetKitDisplayNameCmd extends Cmd {

    public SetKitDisplayNameCmd(SkyWarsReloaded plugin) {
        super(plugin, "skywarskit", "displayname", "skywars.command.kit.displayname", false, "<kit> <displayname>", "Set the kit's display name.");
    }

    @Override
    public boolean run(SWCommandSender sender, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(plugin.getUtils().colorize("&cPlease enter a kit name."));
            return true;
        } else if (args.length == 1) {
            sender.sendMessage(plugin.getUtils().colorize("&cPlease enter the display name of the kit."));
            return true;
        }

        final String kitName = args[0];
        SWKit kit = plugin.getKitManager().getKitByName(kitName);
        if (kit == null) {
            sender.sendMessage(plugin.getUtils().colorize("&cThere is no kit with that name."));
            return true;
        }

        args = Arrays.copyOfRange(args, 1, args.length);
        String displayName = String.join(" ", args);
        kit.setDisplayName(displayName);
        kit.saveData();
        
        sender.sendMessage(plugin.getUtils().colorize("&aThe display name of the kit &e" + kitName + " &ahas been changed to &e" + displayName + "&a!"));
        return true;
    }
}