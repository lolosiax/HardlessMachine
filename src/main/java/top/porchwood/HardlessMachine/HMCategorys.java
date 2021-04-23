package top.porchwood.HardlessMachine;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.InvalidPluginException;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Heads;
import top.porchwood.Logger;

public class HMCategorys {
    private static HMCategorys instance;
    public static HMCategorys getInstance(){
        return instance == null ? instance = new HMCategorys() : instance;
    }

    HardlessMachine plugin;
    NamespacedKey namespaceKey;
    Logger logger;
    private HMCategorys(){
        logger = Logger.getLogger();
        plugin = HardlessMachine.getInstance();
        //if(plugin == null) throw new InvalidPluginException();
        instance = this;
        namespaceKey = plugin.getNamespacedKey();
        categoryInit();
    }
    public Category TOOLS;
    public Category MACHINE;
    public Category LOGISTICS;
    public Category STORAGE;

    private void categoryInit(){
        logger.debug("Categorys：初始化物品列表注册");
        MACHINE = new Category(namespaceKey, new CustomItem(Material.BLAST_FURNACE,"&fHardlessMachine &a机器"));
        TOOLS = new Category(namespaceKey, new CustomItem(Material.DIAMOND_PICKAXE,"&fHardlessMachine &a工具"));
        //LOGISTICS = new Category(namespaceKey, new CustomItem(Material.BUCKET, "&fHardlessMachine &a物流"));
        LOGISTICS = new Category(namespaceKey, new CustomItem(Heads.NULL, "&fHardlessMachine &a物流"));
        STORAGE = new Category(namespaceKey, new CustomItem(Material.LIGHT_BLUE_SHULKER_BOX, "&fHardlessMachine &a存储"));
    }
}
