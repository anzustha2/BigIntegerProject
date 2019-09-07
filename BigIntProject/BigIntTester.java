//package projects.bigintproject;

public class BigIntTester
{
   public static void main(String[] args)
   {
      BigInt a = new BigInt("4");
      BigInt b = new BigInt("8");
      BigInt c = a.add(b);      
      display(a, b, c, 1);
      
      a = new BigInt("-4");
      b = new BigInt("8");
      c = a.add(b);      
      display(a, b, c, 1);
      
      a = new BigInt("4");
      b = new BigInt("-8");
      c = a.add(b);      
      display(a, b, c, 1);
      
      a = new BigInt("-4");
      b = new BigInt("-8");
      c = a.add(b);      
      display(a, b, c, 1); 
      
      a = new BigInt("7");
      b = new BigInt("3");
      c = a.sub(b);      
      display( a, b, c, 2);
      
      a = new BigInt("3");
      b = new BigInt("7");
      c = a.sub(b);
      display(a, b, c, 2);
      
      a = new BigInt("7");
      b = new BigInt("-3");
      c = a.sub(b);
      display(a, b, c, 2);
      
      a = new BigInt("3");
      b = new BigInt("-7");
      c = a.sub(b);
      display(a, b, c, 2);

      a = new BigInt("-3");
      b = new BigInt("-7");
      c = a.sub(b);
      display(a, b, c, 2);
      
      a = new BigInt("0");
      b = new BigInt("0");
      c = a.sub(b);
      display(a, b, c, 2);
      
      a = new BigInt("10000000000");
      b = new BigInt("10000000000");
      c = a.sub(b);
      display(a, b, c, 2);

      a = new BigInt("-10000000000");
      b = new BigInt("10000000001");
      c = a.add(b);
      display(a, b, c, 1);

      a = new BigInt("4980293480293575849730293555555577756756984579848484848");
      b = new BigInt("859403958209343498759487358273450982374595874578");
      c = a.add(b);
      display(a, b, c, 1);
      
      a = new BigInt("4980293480293575849730293555555577756756984579848484848");
      b = new BigInt("859403958209343498759487358273450982374595874578");
      c = a.add(b);
      display(a, b, c, 1);
      
      a = new BigInt("1123");
      b = new BigInt("123");
      c = a.sub(b);
      display(a, b, c, 2);

      a = new BigInt("112");
      b = new BigInt("1123");
      c = a.sub(b);
      display(a, b, c, 2);
   /*   
      a = new BigInt("235");
      b = new BigInt("12");
      c = a.times(b);
      display(a, b, c, 3);
      

      a = new BigInt("100001");
      b = new BigInt("999");
      c = a.times(b);
      display(a, b, c, 3);

      a = new BigInt("1006543456347878976001");
      b = new BigInt("999345634563457879875345");
      c = a.times(b);
      display(a, b, c, 3);
      
      int fact = 2000;
      b = new BigInt("1");
      for( int i=fact; i>=1; i-- )
      {
         a = new BigInt("" + i);
         b = b.times(a);
      }
      System.out.println();
      System.out.println( fact + "! = " + b );
*/
   }
   
   public static void display(BigInt a, BigInt b, BigInt c, int operator)
   {
      System.out.println();
      
      int aSize = a.toString().length();//aSize = a.size();
      int bSize = b.toString().length();//b.size();
      int cSize = c.toString().length();//c.size();

      int aAdd = 0, bAdd = 0, cAdd = 0, dashLength = 0;
      if( aSize >= bSize && aSize >= cSize )
      {
         dashLength = aSize;
         aAdd = 0;
         bAdd = aSize - bSize;
         cAdd = aSize - cSize;
      }         
      if( bSize >= aSize && bSize >= cSize )
      {
         dashLength = bSize;
         bAdd = 0;
         aAdd = bSize - aSize;
         cAdd = bSize - cSize;
      }         
      if( cSize >= bSize && cSize >= aSize )
      {
         dashLength = cSize;
         cAdd = 0;
         bAdd = cSize - bSize;
         aAdd = cSize - aSize;
      }         
      
      for( int i=0; i<aAdd; i++ )
         System.out.print(" ");
      System.out.println( "  " + a );      
      for( int i=0; i<bAdd; i++ )
         System.out.print(" ");
         
      if( operator == 1 )
         System.out.println( "+ " + b );      
      else if( operator == 2 )
         System.out.println( "- " + b );      
      else if( operator == 3 )
         System.out.println( "* " + b );
      System.out.print("  ");
      for( int i=0; i<dashLength; i++ )
         System.out.print( "-" );
      System.out.println( );   

      for( int i=0; i<cAdd; i++ )
         System.out.print(" ");
      System.out.println( "  " + c );         
   }
}