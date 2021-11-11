package net.gcnt.skywarsreloaded.command.maps;

import net.gcnt.skywarsreloaded.SkyWarsReloaded;
import net.gcnt.skywarsreloaded.command.Cmd;
import net.gcnt.skywarsreloaded.game.GameTemplate;
import net.gcnt.skywarsreloaded.wrapper.SWCommandSender;

public class EnableCmd extends Cmd {

    public EnableCmd(SkyWarsReloaded plugin) {
        super(plugin, "skywarsmap", "enable", "skywars.command.map.enable", true, "<map>", "Enable a template.");
    }

    @Override
    public boolean run(SWCommandSender sender, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(plugin.getUtils().colorize("&cPlease enter a game template name."));
            return false; // todo not sure if I should return false/true here to show the usage too or not.
        }

        final String templateName = args[0];
        GameTemplate template = plugin.getGameManager().getGameTemplateByName(templateName);
        if (template == null) {
            sender.sendMessage(plugin.getUtils().colorize("&cThere is no game template with that name."));
            return true;
        }
        if (template.isEnabled()) {
            sender.sendMessage(plugin.getUtils().colorize("&cThis template is already enabled."));
            return true;
        }

        template.enable();
        sender.sendMessage(plugin.getUtils().colorize("&aThe template &e" + templateName + " &ahas successfully been &denabled&a!"));
        return true;
    }
}