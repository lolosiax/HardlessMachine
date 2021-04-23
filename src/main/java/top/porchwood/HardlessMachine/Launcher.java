package top.porchwood.HardlessMachine;

import top.porchwood.Logger;

public class Launcher {

    public static final Logger logger = Logger.getLogger();

    public static void init(HardlessMachine plugin) {
        logger.debug("Launcher：初始化物品分组类型注册");
        //HMCategorys.getInstance();
        logger.debug("Launcher：初始化物品注册");
        HMItems.init();
        HMItems.register(plugin);
    }
}
