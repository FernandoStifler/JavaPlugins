package com.monderdragon.loockeventos.guerra.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.monderdragon.loockeventos.guerra.Guerra;

public class Sair {

	public static void executar(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			Guerra.Sair(p);
		} else {
			sender.sendMessage("§cImpossivel utilizar pelo console.");
		}
	}

}
