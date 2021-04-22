class Student {
  String name = "sato";

  public void calculateAvg(int math, int english) {
    System.out.println((math + english) / 2);
  }
}

public class Test_04 {
  public static void main(String[] args) {
    Student a001 = new Student();
    a001.name = "aaa";
    System.out.println(a001.name);
    a001.calculateAvg(90,80);

    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);
  }
}


// class Test_04 {
//   public static void main(String[] args) {
//     int age = 0;

//     if (age >= 20){
//       System.out.println("adult");
//     } else if(age == 0){
//       System.out.println("baby");
//     } else {
//       System.out.println("child");
//     }

    // for(int i = 0; i <= 4; i++){
    //   System.out.println(i);
    // }

    // for(int i = 0; i <= 4; i++){
    //   if(i==3){
    //     break;
    //   }
    //   System.out.println(i);
    // }
    // for(int i = 0; i <= 4; i++) {
    //   if(i==3){
    //     continue;
    //   }
    //   System.out.println(i);
    // }
    // for(int i = 0; i <= 2; i++){
    //   for(int j = 0; j<= 2; j++ ){
    //     System.out.println(i + "-" + j);
    //   }
    // }

//     int arr[] = {2,4,6,8,10};
//     int sum = 0;

//     for( int i =0; i <= 4; i++ ) {
//       sum += arr[i];
//     }
//     System.out.println(sum);
//   }
// }