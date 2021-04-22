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


    String[][] arr2;
    arr2 = new String[2][2];

    arr2[0][0] = "aaa";
    arr2[0][1] = "bbb";
    arr2[1][0] = "ccc";
    arr2[1][1] = "ddd";

    System.out.println(arr2[0][0]);
    System.out.println(arr2[0][1]);
    System.out.println(arr2[1][0]);
    System.out.println(arr2[1][1]);

    String[][] arr3 = {{"qq","ww"},{"ee","rr"}};

    System.out.println(arr3[0][0]);
    System.out.println(arr3[0][1]);
    System.out.println(arr3[1][0]);
    System.out.println(arr3[1][1]);

    int x = 10;
    int y = 2;

    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);
    System.out.println(x%y);

  }
}