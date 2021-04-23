package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.porchwood.Logger;

public class HardlessMachine extends JavaPlugin implements SlimefunAddon {

    private static final Logger logger = Logger.getLogger();

    @Nullable
    private static HardlessMachine instance;

    @Override
    public void onEnable() {
        instance = this;
        logger.info("&6HardlessMachine正在启动！");
        logger.debug("Plugin：启动Launcher");
        Launcher.init(this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @NotNull
    public static HardlessMachine getInstance() {
        if(instance == null) throw new NullPointerException("在插件启动前获取插件实例（不会发生的吧）");
        return instance;
    }

    @NotNull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/TheSmileCat/HardlessMachine/issues";
    }
}
