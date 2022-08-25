import java.util.HashMap;
import java.util.Map;

public class CharaterCounter {

    public static void main(String []args){

        String name="112223333344";
        char[] nameCh=name.toCharArray();

        HashMap<Character ,Integer> map =new HashMap<Character, Integer>();

        for(Character c :nameCh){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);


        }

        for(Map.Entry m :map.entrySet()){

            //int count= (int) m.getValue();
            if((int)m.getValue()>2){
              System.out.println(m.getKey() +" : "+ m.getValue());
            }


        }




    }
}
