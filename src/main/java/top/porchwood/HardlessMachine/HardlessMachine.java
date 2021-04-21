package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import top.porchwood.Logger;

public class HardlessMachine extends JavaPlugin implements SlimefunAddon {
    Logger logger;
    public static String namespaceKey = "hardness_machine";
    @Override
    public void onEnable() {
        logger = Logger.getLogger();
        logger.info("&6HardlessMachine正在启动！");
        Launcher.init(this);
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
