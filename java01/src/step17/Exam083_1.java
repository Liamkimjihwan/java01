package step17;

public class Exam083_1 {
  static class Student {

    String name;
    String email;
    String tel;
    int age;
    boolean working;


    Student(String name, String email, String tel, int age, boolean working) {

      this.name = name;
      this.email = email;
      this.tel = tel;
      this.age = age;
      this.working = working;

    }

    void printStudent() {
      System.out.printf("%s, %s, %s, %d, %b\n",
      this.name, this.email, this.tel, this.age, this.working);
    }
  }


  public static void main(String[] args) {
    Student[] arr = new Student[3];



arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
arr[1] = new Student("임꺽정", "leem@test.com", "222-2222", 30, false);
arr[2] = new Student("유관순", "yoo@test.com", "333-3333", 40, true);



for (Student student : arr) {
  student.printStudent();
}
  }
}