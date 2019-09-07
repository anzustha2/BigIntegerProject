//Nurgyun Hasanova
// Filip Horak
// Anju 

public class BigInt
{
   LinkedList<Integer> data;
   boolean isNegative;
   
   public BigInt(String s)
   {
      int n = 0;
      data = new LinkedList<>();
      int i =0;
      if(s.length()>0)
      {
         String temp = s.charAt(0)+"";
         if(temp.equals("-"))
         {
            isNegative = true;
            for(i = 1;i < s.length();i++)
                {
                     n = Integer.parseInt(s.charAt(i)+ "");
                     data.add(n);
                }
         }  
       else
         {
            for(i = 0;i < s.length();i++)
               {
                   n = Integer.parseInt(s.charAt(i)+ "");
                   data.add(n);
               }
       
         }
       }
 
   }
   public BigInt()
   {
      data = new LinkedList<>();
      data.add(0);    
   }
   public boolean isLarger(BigInt b)
   {    
         if(this.isNegative == false && b.isNegative == true)
            {
               if(this.data.size()>b.data.size())
                  return true;
               if(this.data.size()<b.data.size())
                  return false;
               if(this.data.size()==b.data.size())
               {
                  for(int i=0; i<this.data.size(); i++)
                  {
                     if(this.data.get(i)>b.data.get(i))
                        {
                           return true;
                        }
                     if(this.data.get(i)<b.data.get(i))
                        {
                           return false;
                        }
                  }
               }
                  
            }
         if(this.isNegative == true && b.isNegative == false)
            {
               if(this.data.size()>b.data.size())
                  return true;
               if(this.data.size()<b.data.size())
                  return false;
               if(this.data.size()==b.data.size())
               {
                  for(int i=0; i<this.data.size(); i++)
                  {
                     if(this.data.get(i)>b.data.get(i))
                        {
                           return true;
                        }
                     if(this.data.get(i)<b.data.get(i))
                        {
                           return false;
                        }
                  }
               }
                  
            }
         if(this.isNegative == false && b.isNegative == false)
            {
               if(this.data.size()>b.data.size())
                  return true;
               if(this.data.size()<b.data.size())
                  return false;
               if(this.data.size()==b.data.size())
               {
                  for(int i=0; i<this.data.size(); i++)
                  {
                     if(this.data.get(i)>b.data.get(i))
                        {
                           return true;
                        }
                     if(this.data.get(i)<b.data.get(i))
                        {
                           return false;
                        }
                  }
               }
                  
            }
          if(this.isNegative == true && b.isNegative == true)
            {
               if(this.data.size()>b.data.size())
                  return false;
               if(this.data.size()<b.data.size())
                  return true;
               if(this.data.size()==b.data.size())
               {
                  for(int i=0; i<this.data.size(); i++)
                  {
                     if(this.data.get(i)<b.data.get(i))
                        {
                           return true;
                        }
                     if(this.data.get(i)>b.data.get(i))
                        {
                           return false;
                        }
                  }
               }                  
            }
         
         return false;
   }
   
   public BigInt add(BigInt s)
   {
      BigInt c = new BigInt();
      int first = this.data.size()-1;
      int second = s.data.size()-1;
      String ans="";
      String ansFinal = "";
      int temp =0;
      int n = 0;
      int carry = 0;
      int number = 0;
      if(this.isNegative == false && s.isNegative == false)
      {
         if(this.isLarger(s))
         {
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=first; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
                  temp = s.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }      
         }      
      }
      
      if(this.isNegative == true && s.isNegative == true)
      {
         c.isNegative = true;
         if(this.isLarger(s))
         {
         for(int i=0; i<=first; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
                  temp = s.data.get(i) + carry; //
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }      
         }      
      }
      
      if(this.isNegative == false && s.isNegative == true)
      {
         if(this.isLarger(s))
         {
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) - carry - s.data.get(second - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;                  
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            c.isNegative = true;
            for(int i=0; i<=first; i++)
            {
               temp = s.data.get(second - i) - carry - this.data.get(first - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
            temp = s.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }    
      }
      
      if(this.isNegative == true && s.isNegative == false)
      {
         
         if(this.isLarger(s))
         {
         c.isNegative = true;
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) - carry - s.data.get(second - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
                  
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=first; i++)
            {
               temp = s.data.get(second - i) - carry - this.data.get(first - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
            temp = s.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
      }

      return c;
   }
   public BigInt sub(BigInt s)
   {
      BigInt c = new BigInt();
      int first = this.data.size()-1;
      int second = s.data.size()-1;
      String ans="";
      String ansFinal = "";
      int temp =0;
      int n = 0;
      int carry = 0;
      int number = 0;
      if(this.isNegative == false && s.isNegative == true)
      {
         if(this.isLarger(s))
         {
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=first; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
                  temp = s.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }      
         }
      
      }
      if(this.isNegative == true && s.isNegative == false)
      {
         c.isNegative = true;
         if(this.isLarger(s))
         {
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i) + carry; //
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=first; i++)
            {
               temp = this.data.get(first - i) + s.data.get(second - i) + carry;
               carry = temp / 10;
               temp = temp%10;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
                  temp = s.data.get(i) + carry;
                  carry = temp / 10;
                  temp = temp%10;
                  ansFinal = temp + ansFinal;
             }
             c.data.add(carry);
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }      
         }
      
      }
      
      if(this.isNegative == false && s.isNegative == false)
      {
         if(this.isLarger(s))
         {
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) - carry - s.data.get(second - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;                  
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            c.isNegative = true;
            for(int i=0; i<=first; i++)
            {
               temp = s.data.get(second - i) - carry - this.data.get(first - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
            temp = s.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }    
      }

   if(this.isNegative == true && s.isNegative == true)
      {
         
         if(this.isLarger(s) == false)
         {
         c.isNegative = true;
         for(int i=0; i<=second; i++)
            {
               temp = this.data.get(first - i) - carry - s.data.get(second - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = first - second-1 ;i >-1 ;i--)
             {
                  temp = this.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
                  
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }
         else
         {
            for(int i=0; i<=first; i++)
            {
               temp = s.data.get(second - i) - carry - this.data.get(first - i) ;
               if(temp<0)
               {
               temp = temp +10;
               carry = 1;
               }
               else
               carry =0;
               ansFinal = temp + ansFinal;
            }
            for(int i = second - first-1 ;i >-1 ;i--)
             {
            temp = s.data.get(i)-carry;
                  if(temp<0)
                  {
                     temp = temp + 10;
                     carry = 1;
                  }
                  else
                  carry =0;
                  ansFinal = temp + ansFinal;
             }
            
            for(int i = 0;i < ansFinal.length();i++)
             {
                n = Integer.parseInt(ansFinal.charAt(i)+ "");
                c.data.add(n);
             }
         }

      
      }

      return c;
   }
   
   public String toString()
   {
      int s = data.size();
      String r ="";
      String negative ="-";
      String temp = "";
      boolean x = false;
      int size = 0;
      int sizeAndComa = 0;
      int mode = 0;
      String ans ="";
      int j=0;
          
        for(int i=0; i<s; i++)
        {
         r+= data.get(i);
        }
        
        r = r.replaceFirst("^0+(?!$)", "");  
       
         size = r.length();
         
         sizeAndComa = size/ 3;
         mode = size % 3;
         if(mode ==0)
         sizeAndComa--;
         
         String[] coma = new String[sizeAndComa + size];

         
         for(int count =  coma.length -1; count>-1; count--)
         {
            if(j%3 == 0 & j != 0 && j != r.length())
               {
                  coma[count] = ",";
                  count--;
               }
            coma[count] = r.charAt(r.length()-1 -j ) + "";
            j++;
         }
         
         for(int i=0; i<coma.length; i++)
         {
            ans+=coma[i];
         }
         
         temp = ans.charAt(0) + "";
         x= temp.equals("0");
       if( isNegative == true && x == false)
          ans = negative + ans; 
     
      return ans;
   }
}