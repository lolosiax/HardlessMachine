package top.porchwood.HardlessMachine.HMItem.RunningTools;

import org.bukkit.NamespacedKey;
import top.porchwood.HardlessMachine.HardlessMachine;

public class Keys {
    public static NamespacedKey makeKey(String keySubName) {
        return new NamespacedKey(HardlessMachine.getInstance(), "HardlessMachine_" + keySubName);
    }
}
