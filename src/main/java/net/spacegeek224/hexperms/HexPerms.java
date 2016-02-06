package net.spacegeek224.hexperms;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HexPerms extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info(ChatColor.GREEN + "HexPerms enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "HexPerms disabled!");
	}
	
}
