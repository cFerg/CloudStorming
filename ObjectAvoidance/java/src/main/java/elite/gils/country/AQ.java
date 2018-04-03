package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum AQ {
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
    
    AQ(String name){
        this.name = name;
    }
    
    public String getName(AQ state){
        return state.name;
    }
}