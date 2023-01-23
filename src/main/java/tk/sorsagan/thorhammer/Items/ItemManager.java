package tk.sorsagan.thorhammer.Items;

import com.sun.tools.javac.util.Names;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack Mjolnir;

    public static void init() {
        createMjolnir();
    }

    private static void createMjolnir(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3§lMjölnir");
        List<String> lore = new ArrayList<>();
        lore.add("§1Left Click for Normal Attack");
        lore.add("§1Right Click for Lightning Attack");
        lore.add("");
        lore.add("§6§lLEGENDARY");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        Mjolnir = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("mjolnir"), item);
        sr.shape("DBD", " S ", " S ");
        sr.setIngredient('D', Material.NETHERITE_INGOT);
        sr.setIngredient('B', Material.NETHER_STAR);
        sr.setIngredient('S', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(sr);
    }
}
