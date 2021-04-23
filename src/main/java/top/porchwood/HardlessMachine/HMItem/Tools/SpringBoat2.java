package top.porchwood.HardlessMachine.HMItem.Tools;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class SpringBoat2 extends SpringBoat {
    public SpringBoat2(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        vAddValue = new Vector(0, 2.3, 0);
    }
}
