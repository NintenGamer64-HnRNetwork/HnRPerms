package com.weebly.openboxtechnologies.hnrperms;

/**
 * Created by zhiyuanqi on 17/05/16.
 */

import org.bukkit.ChatColor;

public class ChatMessages {
    final String permError = returnAlternateColorString("&e&lHnRPerms&7&l> &9To use this feature, you must be rank &8(&cADMIN&8)&9!");
    final String helpChat = returnAlternateColorString("&e&lHnRPerms&7&l> &a/hnrperms &f- Displays the help menu\n" +
            "&e&lHnRPerms&7&l> &a/hnrperms setrank <player> <rank> &f- Sets the rank of someone\n" +
            "&e&lHnRPerms&7&l> &a/hnrperms addrank <player> <rank> &f- Adds a player to a rank\n" +
            "&e&lHnRPerms&7&l> &a/hnrperms removerank <player> <rank> &f- Removes a player from a rank\n");
    final String suffix = returnAlternateColorString("&9!");

    final String set1 = returnAlternateColorString("&e&lHnRPerms&7&l> &9You have set &c");
    final String set2 = returnAlternateColorString("&9’s rank to &b");

    final String rankAdd1 = returnAlternateColorString("&e&lHnRPerms&7&l> &9You have added &c");
    final String rankAdd2 = returnAlternateColorString(" to &b");

    final String rankRM1 = returnAlternateColorString("&e&lHnRPerms&7&l> &9You have removed &c");
    final String rankRM2 = returnAlternateColorString(" from &b");

    final String playerSet = returnAlternateColorString("&e&lHnRPerms&7&l> &9Your rank has been set to &b");
    final String playerAdd = returnAlternateColorString("&e&lHnRPerms&7&l> &9You have been added to &b");
    final String playerRM = returnAlternateColorString("&e&lHnRPerms&7&l> &9You have been removed from &b");

    private final String returnAlternateColorString(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
