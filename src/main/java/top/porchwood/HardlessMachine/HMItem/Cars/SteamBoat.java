package top.porchwood.HardlessMachine.HMItem.Cars;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.FluidCollisionMode;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import top.porchwood.Logger;

public class SteamBoat extends SlimefunItem {
    public SteamBoat(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemHandler[] handlers = new ItemHandler[]{(ItemUseHandler) this::onPlayerRightClick,};
        addItemHandler(handlers);
    }

    public void onPlayerRightClick(PlayerRightClickEvent e){
        Player player = e.getPlayer();
        Block block = player.getTargetBlockExact(4, FluidCollisionMode.ALWAYS);
        if(block == null) return;
        Logger.getLogger().debug("block: " + block.getType() + ", " + block.getLocation());
    }

}
