public class test {
  int max(int a,int b) {
      int result;
      if (a > b)
          result = a;
      else
          result = b;
      return result;
  }
  public static void main(String[] args){
      test t=new test();
      System.out.println(t.max(10,20));


    }

}
