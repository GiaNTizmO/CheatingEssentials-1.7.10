package qmaks.cheatingessentials.mod.commands;

import net.minecraft.client.multiplayer.ServerData;
import qmaks.cheatingessentials.api.command.Command;
import qmaks.cheatingessentials.mod.wrapper.Wrapper;

public class ACommandServerIP extends Command {
	
	public ACommandServerIP() {
		super("si");
	}

	@Override
	public void runCommand(String s, String[] subcommands) {
 		ServerData serverData = Wrapper.INSTANCE.mc().func_147104_D();
 		if(serverData != null) {
 	 	   Wrapper.INSTANCE.addChatMessage("&9[&bCE Console&9] &fServer IP: &e" + serverData.serverIP);
           Wrapper.INSTANCE.copy(serverData.serverIP);
           Wrapper.INSTANCE.addChatMessage("&9[&bCE Console&9] &fIP is copied to the clipboard.");
 		} else {
 		   Wrapper.INSTANCE.addChatMessage("&9[&bCE Console&9] &fIt is a single game!");
 		}
	}

	@Override
	public String getDescription() {
		return " - Getting the IP of the server.";
	}
	
	@Override
	public String getSyntax() {
		return "&9[&bCE Console&9] &cUsage: " + this.getCommand();
	}
}
