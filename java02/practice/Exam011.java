
public class Exam011 {

  public static void main(String[] args) {
    Student s1;
    Student s2;

    s1 = new Student();
    s2 = new Student();

    s1.name = new String("홍길동");
    s1.email = new String("hong@test.com");
    s1.tel = new String("1111-1111");
    s1.age = 38;
    s1.working = true;


    s1.name = "홍길동";
    s1.email = "hong@test.com";
    s1.tel = "1111-1111";
    s2.age = 20;
    s2.working = false;

    System.out.println(s1.name);
    System.out.println(s2.age);

  }
}
