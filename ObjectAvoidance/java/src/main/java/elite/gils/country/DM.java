package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum DM {
    //List of State/Province names (Use 2 Letter/Number Combination codes)
    
    /**
     * Name:
    */
    AA("Example"),
    
    /**
     * Name:
    */
    AB("Example"),
    
    /**
     * Name:
    */
    AC("Example");
    
    //Leave the code below alone (unless optimizing)
    
    private final String name;
    
    DM(String name){
        this.name = name;
    }
    
    public String getName(DM state){
        return state.name;
    }
}