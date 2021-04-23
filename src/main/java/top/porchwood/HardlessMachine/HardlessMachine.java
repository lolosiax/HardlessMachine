package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.porchwood.Logger;

public class HardlessMachine extends JavaPlugin implements SlimefunAddon {

    public static final String NAMESPACE_KEY_PREFIX = "HardnessMachine";

    private static final Logger logger = Logger.getLogger();

    @Nullable
    private static HardlessMachine instance;

    @Nullable
    private NamespacedKey namespacedKey;

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

    @Nullable
    public static HardlessMachine getInstance() {
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
