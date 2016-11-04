
package step04.test;

 public class Test1 {
   public static void main(String[] args) {
int age = Integer.parseInt(args[0]);

    String result = (age < 19) ? "미성년" : "성년"; // ok
    System.out.println(result);

 }
}
