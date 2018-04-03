package elite.math;

import elite.compression.Nit;
import java.util.ArrayList;
import java.util.List;

public class Formulas {
    List<Nit> nitArray = new ArrayList<>();
    
    public void add(byte b){
        //5,284,012
        nitArray.add(new Nit((byte)5,(byte)2));
        nitArray.add(new Nit((byte)8,(byte)4));
        nitArray.add(new Nit((byte)0,(byte)1));
        nitArray.add(new Nit((byte)2));
    }
}