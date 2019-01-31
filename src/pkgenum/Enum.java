
package pkgenum;

public class Enum {
    enum EnumConstants
            {
                COMPOSE, INBOX, SENT , TEMP;//; is not mandatory but if declare any other thing than at the end ; mandatory
                
                //if we are not declare then default contructor with empty implementation executed
        private EnumConstants() {
            System.out.println("Enum Contructor"); 
        }
    }
    
    public static final String COMPOSE = "1";
    public static final String INBOX = "2";
    public static final String SENT = "3";
    
    static void ec(EnumConstants e) //type safety
	{
            if(e==EnumConstants.COMPOSE)
            {
                    System.out.println("Enum Compose Operation ");
            }
            else if(e==EnumConstants.INBOX)
            {
                    System.out.println("Enum Inbox Operation ");
            }
            else
            {
                    System.out.println("Enum Else Block Sent Operation ");
            }
	}
    
    static void stringConstants(String key)
    {
        switch (key) {
            case "1":
                System.out.println("String Compose Operation ");
                break;
            case "2":
                System.out.println("String Inbox Operation ");
                break;
            default:
                System.out.println("String default case Sent Operation ");
                break;
        }
    }
	public static void main(String[] args)
	{
            
		Enum.ec(EnumConstants.COMPOSE);//it provide type safety because it only take enum type Constant not simple values
		Enum.ec(EnumConstants.INBOX);
                Enum.ec(EnumConstants.TEMP);
		//Enum.ec(EnumConstants.SENT);  
                //Enum.ec("SENT");  //it gives error so its type safe, 
                
                Enum.stringConstants("1");
                Enum.stringConstants("2");
                Enum.stringConstants("12245"); //it takes any argument so it is not type safe
	}
    
}
