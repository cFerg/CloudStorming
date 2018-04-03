package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum AS {
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
    
    AS(String name){
        this.name = name;
    }
    
    public String getName(AS state){
        return state.name;
    }
}