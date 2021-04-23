package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.InvalidPluginException;
import top.porchwood.Logger;

public class Launcher {
    public static Logger logger;
    public static void init(HardlessMachine plugin){
        logger = Logger.getLogger();
        logger.debug("Launcher：初始化物品分组类型注册");
        HMCategorys.getInstance();
        logger.debug("Launcher：初始化物品注册");
        HMItems.init();
        HMItems.register(plugin);
    }
}
