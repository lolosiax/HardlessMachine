package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Heads;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Keys;

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

    public static final MultiCategory HM_MAIN_CATEGORY =
            new MultiCategory(Keys.makeKey("MainCategory"), new CustomItem(Heads.NULL, "&fHardlessMachine"));

    public static final SubCategory TOOLS =
            new SubCategory(Keys.makeKey("Tools"), HM_MAIN_CATEGORY, new CustomItem(Material.DIAMOND_PICKAXE, "&fHardlessMachine &a工具"));

    public static final SubCategory MACHINE =
            new SubCategory(Keys.makeKey("Machine"), HM_MAIN_CATEGORY, new CustomItem(Material.BLAST_FURNACE, "&fHardlessMachine &a机器"));

    public static final SubCategory LOGISTICS =
            new SubCategory(Keys.makeKey("Logistics"), HM_MAIN_CATEGORY, new CustomItem(Material.BUCKET, "&fHardlessMachine &a物流"));

    public static final SubCategory STORAGE =
            new SubCategory(Keys.makeKey("Storage"), HM_MAIN_CATEGORY, new CustomItem(Material.LIGHT_BLUE_SHULKER_BOX, "&fHardlessMachine &a存储"));
    public static final SubCategory TRANSPORTATION =
            new SubCategory(Keys.makeKey("Transportation"), HM_MAIN_CATEGORY, new CustomItem(Material.DARK_OAK_BOAT, "&fHardlessMachine &a交通"));

}
