package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum CL {
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
    
    CL(String name){
        this.name = name;
    }
    
    public String getName(CL state){
        return state.name;
    }
}