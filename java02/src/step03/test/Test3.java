package step03.test;
// 저자 , 책 이름, 가격, 출판일, 페이지
 public class Test3 {
  // 새로운 데이터 파일을 저장한다.
  static class Product {

  String name;
  int resolution;
  double Size;
  String language;
  String maker;
  String weight;
  String price;
  boolean used;
}
  public static void main(String[] args) {
  //2) 데이터 타입에 따라 메모리(인스턴스)르 준비한다.
    Product pro = new Product();
 //3) 준비한 메모리 안에 있는 변수에 값 저장
    pro.name = "삼성 커브드 pull hd TV";
    pro.resolution = 1920 * 1080;
    pro.Size = 1241.6*721.4;
    pro.language = "korean";
    pro.maker = "삼성전자";
    pro.weight = "17.6kg";
    pro.price = "1,254,570원";
    pro.used = false;

  System.out.println(pro.name);
  System.out.println(pro.resolution);
  System.out.println(pro.Size);
  System.out.println(pro.language);
  System.out.println(pro.maker);
  System.out.println(pro.weight);
  System.out.println(pro.price);
  System.out.println(pro.used);


   }
 }
