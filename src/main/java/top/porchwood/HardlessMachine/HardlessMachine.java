package top.porchwood.HardlessMachine;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import top.porchwood.Logger;

public class HardlessMachine extends JavaPlugin implements SlimefunAddon{
    Logger logger;
    public static final String namespaceKey_string = "hardness_machine";
    private static HardlessMachine instance;
    private NamespacedKey namespacedKey;
    @Override
    public void onEnable(){
        instance = this;
        logger = Logger.getLogger();
        logger.info("&6HardlessMachine正在启动！");
        logger.debug("Plugin：启动Launcher");
        Launcher.init(this);
    }

    @Override
    public void onDisable() {

    }

    public NamespacedKey getNamespacedKey() {
        return namespacedKey == null ? namespacedKey = new NamespacedKey(this,namespaceKey_string) : namespacedKey;
    }

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
