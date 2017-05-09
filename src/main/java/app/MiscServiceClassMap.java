package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import base.Solution;
import solutions.dp.*;

public class MiscServiceClassMap extends HashMap<String, List<Class<? extends Solution<?,?>>>> {
    private static final long serialVersionUID = 8181297436296714924L;
    private String latest;
    
    public MiscServiceClassMap(){
        addClass("dp1", MaxCommonSubSeqBtmUp.class);
        addClass("dp1", MaxCommonSubSeqTopDwn.class);
        addClass("dp2", KnapsackBtmUp.class);
        addClass("dp2", KnapsackTopDwn.class);
        addClass("dp3", ChainMatricesBtmUp.class);
        addClass("dp3", ChainMatricesTopDwn.class);
    }
    
    private void addClass(String key, Class<? extends Solution<?,?>> solutionClass) {
        latest = key;
        if (this.containsKey(key)){
            this.get(key).add(solutionClass);
        } else {
            List<Class<? extends Solution<?,?>>> classLst = new ArrayList<Class<? extends Solution<?,?>>>();
            classLst.add(solutionClass);
            this.put(key, classLst);
        } 
    }
    
    public String getLatest(){
        return latest;
    }
}
