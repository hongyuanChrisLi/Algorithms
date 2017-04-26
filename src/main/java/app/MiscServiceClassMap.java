package app;

import java.util.HashMap;

import base.SolutionService;
import services.dp.*;

public class MiscServiceClassMap extends HashMap<String, Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8181297436296714924L;
    private String latest;
    
    public MiscServiceClassMap(){
        addClass("dp1", MaxCommonSubSeqServiceImpl.class);
        addClass("dp2", KnapsackServiceImpl.class);
        addClass("dp3", ChainMatricesServiceImpl.class);
    }
    
    private void addClass(String key, Class<? extends SolutionService> solutionClass) {
        latest = key;
        this.put(key, solutionClass);
    }
    
    public String getLatest(){
        return latest;
    }
}
