package elite.math;

/**
 *
 * @author CFerg (Elite)
 */
public class Symbol {
    public enum Symbols{
        CDF ("F(x)"),
        PDF ("f(x)"),
        SUMMATION ("∑");
        
        private final String symbol;
        private
        
        Symbols(String symbol){
            this.symbol = symbol;
        }
        
        public String symbol(){return this.symbol;}
    }
}
