package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.InvalidPluginException;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Heads;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Keys;
import top.porchwood.Logger;

import java.security.PublicKey;

public class HMCategorys {
    //static Logger logger;
    //private static HMCategorys instance;
    //public static HMCategorys getInstance(){
    //    return instance == null ? instance = new HMCategorys() : instance;
    //}

    //HardlessMachine plugin;
    //private HMCategorys(){
    //    plugin = HardlessMachine.getInstance();
    //    //if(plugin == null) throw new InvalidPluginException();
    //    instance = this;
    //    //categoryInit();
    //}
    public static final MultiCategory HM_MAIN_CATEGORY;
    public static final SubCategory TOOLS;
    public static final SubCategory MACHINE;
    public static final SubCategory LOGISTICS;
    public static final SubCategory STORAGE;

    static{
        //logger = Logger.getLogger();
        //logger.debug("Categorys：初始化物品列表注册");
        HM_MAIN_CATEGORY = new MultiCategory(Keys.makeKey("MainCategory"), new CustomItem(Heads.NULL,"&fHardlessMachine"));
        MACHINE = new SubCategory(Keys.makeKey("Machine"), HM_MAIN_CATEGORY, new CustomItem(Material.BLAST_FURNACE,"&fHardlessMachine &a机器"));
        TOOLS = new SubCategory(Keys.makeKey("Tools"), HM_MAIN_CATEGORY, new CustomItem(Material.DIAMOND_PICKAXE,"&fHardlessMachine &a工具"));
        LOGISTICS = new SubCategory(Keys.makeKey("Logistics"), HM_MAIN_CATEGORY, new CustomItem(Material.BUCKET, "&fHardlessMachine &a物流"));
        STORAGE = new SubCategory(Keys.makeKey("Storage"), HM_MAIN_CATEGORY, new CustomItem(Material.LIGHT_BLUE_SHULKER_BOX, "&fHardlessMachine &a存储"));
    }
}
