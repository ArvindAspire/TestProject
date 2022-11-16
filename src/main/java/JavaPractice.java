import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaPractice {

    public static void main(String[] args) {


        //join array string with delimiter
        String[] arr = new String[]{"t","r","v"};
        String join = String.join(":",arr);
        System.out.println(join);

        String join1=Arrays.asList(arr)
                .stream()
                .collect(Collectors.joining(";"));

        System.out.println(join1);

        String name = "The work is good";
        String[] nameArray = name.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String a : nameArray){

            sb.append(a.substring(0,1).toUpperCase()).append(a.substring(1));
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}
