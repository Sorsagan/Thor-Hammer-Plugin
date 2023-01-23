package tk.sorsagan.thorhammer.Events;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import tk.sorsagan.thorhammer.Items.ItemManager;

public class MjolnirEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.Mjolnir.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.getWorld().spawnParticle(Particle.ELECTRIC_SPARK, player.getTargetBlock(null, 20).getLocation(), 25);
                    player.getWorld().strikeLightning(player.getTargetBlock(null, 20).getLocation());
                }
            }
        }
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
            if (event.getItem().getItemMeta().equals(ItemManager.Mjolnir.getItemMeta())) {
                Player player = event.getPlayer();
                player.getWorld().spawnParticle(Particle.ELECTRIC_SPARK, player.getLocation(), 10);
            }
        }
    }
}
