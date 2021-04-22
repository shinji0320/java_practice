class Test_03 {
  public static void main(String[] args) {

    int var_a = 10;
    int var_b = 1;
    boolean var_bool;

    var_bool = (var_a < var_b);

    System.out.println(var_bool);

    String[] arr;
    arr = new String[3];

    arr[0]="sato";
    arr[1]="suzuki";
    arr[2]="tanaka";
    // arr[3]="aaa";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    // System.out.println(arr[3]);

    String[] arr1 = {"sato","suzuki","tanaka"};

    arr1[1] = "kato";

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
  }
}