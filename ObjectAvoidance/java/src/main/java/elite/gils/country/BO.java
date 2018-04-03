package elite.gils.country;

/**
 * Continent: (Name)
 * Country: (Name)
*/

public enum BO {
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
    
    BO(String name){
        this.name = name;
    }
    
    public String getName(BO state){
        return state.name;
    }
}