package practical4;
import java.util.Map;
import java.util.HashMap;

class MapExample2{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  //Elements can traverse in any order  
  for(Map.Entry<Integer, String> m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
} 
