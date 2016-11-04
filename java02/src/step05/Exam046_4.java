
package step05;

 public class Exam046_4 {
   public static void main(String[] args) {
     int age  = Integer.parseInt(args[0]);


     if (age < 8)
     System.out.println("유아입니다.");
     else
       if( age >= 8 && age < 14)
       System.out.println("초등학생입니다.");
      else
          if(age >= 14 && age < 17)
         System.out.println("중학생입니다.");
        else
           if(age >=17 && age < 20)
            System.out.println("고등학생입니다.");

        else
            System.out.println("성인입니다.");



       }

}


/*
if ~ else

- else 불록 안에 또 if ~ else 를 중첩 가능
- else 문은 독립적으로 사용할 수 없다.
반드시 if 문 뒤에 사용해야 한다.






*/
