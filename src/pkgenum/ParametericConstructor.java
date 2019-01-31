
package pkgenum;

public class ParametericConstructor {
   enum Heroine
   {
        ANU(10),RANI(20,8),TARA(15);
	int rating;
	Heroine(int rating)
	{
		System.out.println("Single Parameterized Constructor");
		this.rating = rating;
	}
	
	Heroine(int rating,int b)
	{
		System.out.println("Double Parameterized Constructor");
		this.rating = rating; /* comment this line and see enum gives it index defaulty*/
	}
        
       /*
         public static void main(String[] args)
        {
            System.out.println("Main Method inside the enum.");
        }
        */
   }
   public static void main(String[] args){
		Heroine[] h1 = Heroine.values();//values method is used to return all the constants
		for(Heroine hh: h1)
		{
			System.out.println(hh+"----"+hh.rating);
		}
   }
}
