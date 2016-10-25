public class Exam000 {
static int sum(int[] values) {
  int result = 0;
  for (int value : values) {
    result += value;
  }
  return result;
}

static int sum2(int...values) {
  int result = 0;
  for (int value : values) {
    result += value;
  }
  return result;
}
public static void main(String[] args) {
  int result = sum(new int[]{100, 100, 90});
System.out.println(result);
System.out.println(sum(new int[]{90,90,20,80,40}));
System.out.println("______________________");


System.out.println(sum2(100,80,90,200));
System.out.println(sum2(90,20,30,60,80,90));












}
}
