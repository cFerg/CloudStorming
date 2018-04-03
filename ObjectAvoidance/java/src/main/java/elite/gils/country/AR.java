package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum AR {
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
    
    AR(String name){
        this.name = name;
    }
    
    public String getName(AR state){
        return state.name;
    }
}