package tk.sorsagan.thorhammer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import tk.sorsagan.thorhammer.Events.MjolnirEvents;
import tk.sorsagan.thorhammer.Items.ItemManager;

public final class ThorHammer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MjolnirEvents(),this);
        ItemManager.init();
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Thor Hammer"+ ChatColor.GREEN+ " Enabled!");
    }
}
