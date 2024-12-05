package me.Mastervrunner.Hello_World;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	// /hello <name> <amount>
	// <-- Hey how are you!
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//hello
		if (label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.GOLD + "Hello " + ChatColor.BLUE + player.getName() + ChatColor.GOLD + "!");
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "You have to be a player to run this, lol");
				return true;
			}
			
		}
		return false;
		
	}

}
