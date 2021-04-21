package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Launcher {
    public static void init(HardlessMachine plugin) {
        NamespacedKey categoryId = new NamespacedKey(plugin, HardlessMachine.namespaceKey);
        CustomItem categoryItem = new CustomItem(Material.DIAMOND, "&4Our very cool Category");
        Category category = new Category(categoryId, categoryItem);
        new SlimefunItem(category, HMItems.ITEM1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CLOTH, null, null,
                null, new ItemStack(Material.STICK), null,
                null, null, new ItemStack(Material.STICK)
        }).register(plugin);
    }
}
