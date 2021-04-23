package top.porchwood.HardlessMachine.HMItem.RunningTools;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Head {
    public static final String rootResources = "https://gitee.com/this_is_a_cat/plugin-heads/raw/master/HardlessMachine/";
    public static String customRootResources;
    public static String getRoot(){
        return customRootResources == null ? rootResources : customRootResources;
    }
    public static String getPath(String name){
        return getRoot() + name + ".png";
    }
    public static String getBase64(String name){
        String raw = "{\"textures\":{\"SKIN\":{\"url\":\"" + getPath(name) + "\"}}}";
        return Base64.getEncoder().encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }
}
