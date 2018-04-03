package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum BG {
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
    
    BG(String name){
        this.name = name;
    }
    
    public String getName(BG state){
        return state.name;
    }
}