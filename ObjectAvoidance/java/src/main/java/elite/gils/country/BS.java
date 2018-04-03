package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum BS {
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
    
    BS(String name){
        this.name = name;
    }
    
    public String getName(BS state){
        return state.name;
    }
}