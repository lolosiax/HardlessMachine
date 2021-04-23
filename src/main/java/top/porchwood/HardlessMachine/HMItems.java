package top.porchwood.HardlessMachine;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import top.porchwood.HardlessMachine.HMItem.Machines.BlockBreaker;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Head;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Heads;
import top.porchwood.HardlessMachine.HMItem.Tools.*;
import top.porchwood.Logger;

public class HMItems {

    private static final SlimefunItemStack SPRING_BOAT =
            new SlimefunItemStack("SPRING_BOAT", Material.BLAZE_ROD, "&f小&f跳板", "&7原地起飞~", "&8▷ &b1.2&7m/s");
    private static final SlimefunItemStack SPRING_BOAT1 =
            new SlimefunItemStack("SPRING_BOAT1", Material.BLAZE_ROD, "&f基础&f跳板", "&7原地起飞~", "&8▷ &b1.75&7m/s");
    private static final SlimefunItemStack SPRING_BOAT2 =
            new SlimefunItemStack("SPRING_BOAT2", Material.BLAZE_ROD, "&c高级&f跳板", "&7原地起飞~", "&8▷ &b2.3&7m/s");
    private static final SlimefunItemStack SPRING_BOAT3 =
            new SlimefunItemStack("SPRING_BOAT3", Material.BLAZE_ROD, "&b精英&f跳板", "&7原地起飞~", "&8▷ &b3.1&7m/s");
    private static final SlimefunItemStack SPRING_BOAT4 =
            new SlimefunItemStack("SPRING_BOAT4", Material.BLAZE_ROD, "&5终极&f跳板", "&7原地起飞~", "&8▷ &b4&7m/s");
    private static final SlimefunItemStack BLOCK_BREAKER =
            new SlimefunItemStack("BLOCK_BREAKER", Head.getBase64("LostTexture"), "&f方块破坏机", "用于拆除面前的方块");
    private static final SlimefunItemStack NULL =
            new SlimefunItemStack("NULL", Heads.NULL, "&7&oNULL");

    private static final Logger logger = Logger.getLogger();

    public static void init() {
        //
    }

    public static void register(HardlessMachine plugin) {
        logger.debug("Items：注册物品");
        logger.info("开始注册物品...");
        SlimefunItem[] items = new SlimefunItem[]{
                new SlimefunItem(HMCategorys.LOGISTICS, NULL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{new ItemStack(NULL)}),
                //new SlimefunItem(hmCategorys.STORAGE, NULL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{new ItemStack(NULL)}),
                //new SlimefunItem(hmCategorys.LOGISTICS, NULL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{new ItemStack(NULL)}),
                new SpringBoat(HMCategorys.TOOLS, SPRING_BOAT, RecipeType.NULL, null),
                new SpringBoat1(HMCategorys.TOOLS, SPRING_BOAT1, RecipeType.NULL, null),
                new SpringBoat2(HMCategorys.TOOLS, SPRING_BOAT2, RecipeType.NULL, null),
                new SpringBoat3(HMCategorys.TOOLS, SPRING_BOAT3, RecipeType.NULL, null),
                new SpringBoat4(HMCategorys.TOOLS, SPRING_BOAT4, RecipeType.NULL, null),
                new BlockBreaker(HMCategorys.MACHINE, BLOCK_BREAKER, RecipeType.NULL, null),
        };
        logger.info("已发现" + items.length + "个物品");
        logger.debug("Items：遍历注册物品");

        for (SlimefunItem i : items) {
            i.register(plugin);
        }
    }
}
