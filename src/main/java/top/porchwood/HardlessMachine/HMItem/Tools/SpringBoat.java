package top.porchwood.HardlessMachine.HMItem.Tools;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class SpringBoat extends SlimefunItem {
    public SpringBoat(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemHandler[] handlers = new ItemHandler[]{
                (ItemUseHandler) this::onRightClick,
        };
        addItemHandler(handlers);
    }

    Vector vAddValue = new Vector(0, 1.2, 0);

    public void onRightClick(PlayerRightClickEvent e) {
        Player player = e.getPlayer();
        Material block = player.getWorld().getBlockAt(player.getLocation().add(0, -0.5, 0)).getType();
        if (block == Material.AIR || block == Material.WATER || block == Material.LAVA) return;
        player.setVelocity(player.getVelocity().add(vAddValue));
    }
}
