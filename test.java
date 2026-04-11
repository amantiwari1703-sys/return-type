public class test {
    float interest(float p, float r, float t) {
        float si = (p * r * t) / 100;
        return si;


    }

//        int len=s.length();
//        return len;
//
//   String check(int n){
//        String result;
//        if(n%2==0)
//           result="even";
//            else
//                result="odd";
//            return result;
//
//    int check(int a){
//        int result;
//        if(a%2==0)
//            result=1;
//         else
//             result=0;
//         return result;
//
//
//        return result;
//        String msg="good morning";
//       return ;
// int max(int a,int b) {
//      int result;
//     if (a > b)
//         result = a;
//     else
//         result = b;
//     return result;

    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.interest(3, 4, 5));

    }
}





