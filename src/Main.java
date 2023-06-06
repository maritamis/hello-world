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
        Person person = new Person("Mariama");
        Person who = new Person("Delonte");
        person.sayHello();
        System.out.println(person.getCreatedDate());
        who.sayHello();
        System.out.println(who.getCreatedDate());
    }
}