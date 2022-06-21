public class MoneyUtil {

    public static String format(double money){
        return "$" + money;
    }

    public static String format(double money, String symbol){
        if(symbol == null){
            throw new IllegalArgumentException();
        }
        return money+symbol  ;
    }

}
