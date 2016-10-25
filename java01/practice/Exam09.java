public class Exam09 {
 static int[] m1() {
   return m2();
   }
   static int[] m2() {
     return m3();
   }
   static int[] m3() {
     return new int[]{10,20,30};
   }
   public static void main(String[] args) {
   int[] arr1 = m1();

 }

  }
