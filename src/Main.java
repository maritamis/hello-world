import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    /*
    public static int add(int x, int y){
        return x + y;
    }

    public static int greaterValue(int x, int y){
        if(x > y) {
            return x;
        } else{
            return y;
        }
    }

    public static void println(Object out){
        System.out.println(out);
    }
*/
    public static void main(String[] args) {
        /*
        Person person = new Person("Mariama");
        Person who = new Person("Delonte");
        person.sayHello();
        System.out.println(person.getCreatedDate());
        who.sayHello();
        System.out.println(who.getCreatedDate());
        */
        /*
        Calculator cal = new Calculator();
        System.out.println(cal.divide(5, 2));
         */
        // fixed in size
        List<String> names = Arrays.asList(
                "joe",
                "mary",
                "ben",
                "maria",
                "me",
                "suzy"
        );

        List<String> upperCase = names.stream()
                .map(name-> name.toUpperCase())
                .collect(Collectors.toList());

        //System.out.println(upperCase);
        //upperCase.stream().forEach(System.out::println);

        List<String> mNames = names.stream()
                .filter(name-> name.startsWith("m") || name.startsWith("s"))
                .collect(Collectors.toList());
        //mNames.stream().forEach(System.out::println);

        // Iterator example
        Iterator iter = names.iterator();
        while (iter.hasNext()){
           // System.out.println(iter.next());
        }
        // end of iterator example
        System.out.println("With ints");
        List<Integer> numbers = Arrays.asList(5, 10, 340, 2341, 234, 23);
        numbers.stream().forEach(System.out::println);
        // don't need to save it to another array, since just want to print out
        numbers.stream()
                .filter(num -> num > 2)
                .forEach(System.out::println);



        int sum = numbers.stream()
                .reduce(0, (total, next) -> total + next);
                // identity is the index that it is starting at


    }
}