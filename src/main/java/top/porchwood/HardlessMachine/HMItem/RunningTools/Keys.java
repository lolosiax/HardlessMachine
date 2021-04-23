package top.porchwood.HardlessMachine.HMItem.RunningTools;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import top.porchwood.HardlessMachine.HardlessMachine;

public class Keys {
    @NotNull
    public static NamespacedKey makeKey(String keySubName) {
        return new NamespacedKey(HardlessMachine.getInstance(), "HardlessMachine_" + keySubName);
    }
}
