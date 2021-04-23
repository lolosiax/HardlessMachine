package top.porchwood.HardlessMachine.HMItem.RunningTools;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import top.porchwood.HardlessMachine.HardlessMachine;

public class Keys {
    @Nullable
    public static NamespacedKey makeKey(String keySubName) {
        if (HardlessMachine.getInstance() == null) {
            return null;
        }
        return new NamespacedKey(HardlessMachine.getInstance(), "HardlessMachine_" + keySubName);
    }
}
