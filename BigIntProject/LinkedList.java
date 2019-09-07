

public class LinkedList<T extends Comparable<T>> implements List<T>
 {
    Node<T>root;
    public int size()   // repair it for size 0
    {
     Node <T> r = new Node<>();
     r = root;
     int count = 1;
     
      while(r.next != null)
       {
         r = r.next;
         count++;
       }
      return count;
    }
    public void sort()
    {
      for(int i = 0; i < size(); i++)
       {
       
         Node<T> r = root;
         Node<T> r2 = r.next;
         
         while(r2 != null)
         {
            if(r.val.compareTo(r2.val) < 0)
            {
               T temp = r2.val;
               r2.val = r.val;
               r.val = temp;
            }
           r2 = r2.next;
           r = r.next;
        
         }
       }
    }
    public void print()
    {
       Node<T> r = root;
       while(r != null)
        {
          System.out.print(r.val + " ");
            r = r.next;
        }
      
    }
    public void add(T val)
     {
       Node<T> temp = new Node<>();
       temp.val = val;
       
       if(root == null)
        {
          root = temp;
        }
       else
       {
          Node <T> r = root;
          while(r.next != null)
           {
              r = r.next;
           }
        
           r.next = temp;
       
       }
     
     }
     public void add(T val, int idx)
      {
         if(idx<0 || idx > size()-1)
          {
            throw new IndexOutOfBoundsException();
          }
         
         Node<T> temp = new Node<>();
         
         Node<T> r = root;
         
         temp.val = val;
         
         for(int i = 0; i < idx-1; i++)
          {
             r = r.next;
          
          }
         
          temp.next = r.next;
          r.next = temp;
          
          
      }
     public T remove(int idx) throws IndexOutOfBoundsException
   {
      if( idx >= size() || idx < 0 ) 
      {
         throw new IndexOutOfBoundsException(idx + " is out of bounds!");
      }
      T retVal;
      if( idx == 0 ) 
      {
         retVal = root.val;
         root = root.next;
      }
      else
      {
         Node<T> r = root;
         for( int i=0; i<idx-1; i++ ) 
         {
            r = r.next;
         }
         retVal = r.next.val;
         r.next = r.next.next;
      }
      return retVal;
   }
   
     public void clear()
     {
         Node<T> r = new Node<>();
         
         root = r;
     
     }
     
     public boolean isEmpty()
      {
        
          if(root.next == null)
           return true;
          else
           return false;
      
      }
 
    public String toString()
     {
       Node<T> r = new Node<>();
       r = root;
       String str = "";
       while(r.next != null)
        {
           str = str + r.val;
           r = r.next;

        }
     return str;
     }
   
    public void set(int idx, T val) throws IndexOutOfBoundsException
     {
        Node<T> r = new Node<>();
        Node<T> temp = new Node<>();
        temp.val = val;
        r = root;
         for(int i = 0; i < idx-1; i++)
          {
             r = r.next;
          
          }
         
          temp.next = r.next.next;
          r.next = temp;

     }

    public boolean contains(T val)
     {
          Node<T> r = new Node<>();
           r = root;
          
          boolean check = false;
          
          while(r.next != null)
           {
              if(r.val.equals(val))
               {
                 check = true;
               }
             r = r.next;
           }
                   
           return check;
     }
     public T get(int idx)
      {
          Node<T> ans = new Node<>();
          Node<T> r = new Node<>();
          
          r = root;
         
         if(idx<0 || idx > size()-1)   // change range
          {
            throw new IndexOutOfBoundsException();
          }
         
         for(int i = 0; i < idx; i++)
          {
              r = r.next;
          
          }
         
         ans.val = r.val; // changed
      
         return ans.val;
      
      }
    public int indexOf(T val)
    {
        int answ = 0;
        int count = 0;
        boolean check = false;
        Node<T> r = new Node<>();
        r=root;
        
        while(r.next != null && check == false)
         {
           
           if(r.val.equals(val))
             {
                answ = count;
                check = true;
             }
             count++;
             r=r.next;
         }
    
        return answ;
    }
    
    public int lastIndexOf(T val)
     {
        int answ = 0;
        int count = 0;
       
        Node<T> r = new Node<>();
        r=root;
        
        while(r.next != null)
         {
           
           if(r.val.equals(val))
             {
                answ = count;
             }
             count++;
             r=r.next;
         }
        return answ;
     }

 }