package net.spacegeek224.hexperms;

import org.bukkit.ChatColor;

public class ColoredString {
  public String original = "";
  public String res = "";
  public ColoredString(String s) {
    original = s;
    res = ChatColor.translateAlternateColorCodes('&',s);
  }
}
