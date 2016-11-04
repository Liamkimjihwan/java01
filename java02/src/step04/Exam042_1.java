
package step04;

 public class Exam042_1 {
   public static void main(String[] args) {

boolean[] language = new boolean[] {
  true, true, true, true, true, true, true, true, true, true,
  false, true, false, false, false, false, false, false, false, false
};

int v1 = (language[0]) ? 1 : 0;
int v2 = (language[4]) ? 1 : 0;
int v3 = (language[5]) ? 1 : 0;
String result = (v1 + v2 + v3 == 3) ? "Yes" : "No";
System.out.println(result);

/* int v1 = (language[0]) ? 1: 0;
v1 = v1 + ((language[4]) ? 1 : 0);
v1 = v1 + ((language[4]) ? 1 : 0);
String result = (v1 == 3) ? "Yes" : "No";
System.out.println(result);
*/
 }
}
