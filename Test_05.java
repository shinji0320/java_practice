// class Student {
//   String name;

//   public double calculateAvg(double[] data) {
//     double sum = 0;

//     for( int i = 0; i < data.length; i++) {
//       sum += data[i];
//     }

//     double avg = sum/data.length;
//     return avg;
//   }

//   public String judge (double avg) {
//     String result;
//     if(avg >= 60) {
//       result = "passed";
//     } else {
//       result = "failed";
//     }
//     return result;
//   }
// }

// public class Test_05 {
//   public static void main(String[] args) {
//     Student a001 = new Student();
//     a001.name = "sato";
//     double[] data = { 70, 65, 50, 10, 30};

//     double avg = a001.calculateAvg(data);
//     String result = a001.judge(avg);

//     System.out.println(avg);
//     System.out.println(a001.name + " " + result);


//   }
// }










class Food {
  String name;

  public double calculateAvg(double[] data) {
    double sum = 0;

    for( int i = 0; i < data.length; i++) {
      sum += data[i];
    }

    double avg = sum/data.length;
    return avg;
  }

  public String judge (double avg) {
    String result;
    if(avg >= 60) {
      result = "美味しい";
    } else {
      result = "んー";
    }
    return result;
  }
}

public class Test_05 {
  public static void main(String[] args) {
    Food sushi = new Food();
    sushi.name = "tuna";
    double[] data = { 70, 65, 90, 90, 90};

    double avg = sushi.calculateAvg(data);
    String result = sushi.judge(avg);

    System.out.println(avg);
    System.out.println(sushi.name + " " + result);
  }
}