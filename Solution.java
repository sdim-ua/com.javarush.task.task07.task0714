import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
         ArrayList<String> list = new ArrayList<>();
         for (int a = 0; a < 5; a++)
    {
        String s = reader.readLine();
        list.add(s);
    }   
    
    list.remove(2);
    
          for (int i = 0; i < list.size(); i++)
         {
            int k = list.size() -1 - i;
             System.out.println(list.get(k));
         }
     
    }
}
