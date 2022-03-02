public class Test {
    public static void main(String[] args) {

        // year to be checked
        int year = 2400;
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
//        System.out.println("hello world");
//        Test test=new Test();
//       int ans= test.MagicNumber(100);
//        System.out.println("ans:"+ans);
    }

    public  boolean checkLeapYear(int n){

        return false;
    }
    // 100 < , 99,98,97,96 ..... 80 ,79
    // > 101, 102,103, 104, ...., 179
    public int MagicNumber(int n){

        int forward=Integer.MAX_VALUE;
        int backward=Integer.MAX_VALUE;
        int n1=n;
        int n2=n;
        int number=n;
        while(true && n>1){
            if(checkMagicNumber(n1)){
                backward=n1;
                break;
            }
            n1=n1-1;
        }
        while(true){
            if(checkMagicNumber(n2)){
                forward=n2;
                break;
            }
            n2=n2+1;
        }
        System.out.println("backWard=="+ backward);
        System.out.println("forward=="+ forward);
        int min1=Math.abs(number-backward);
        int min2=Math.abs(forward-number);
        if(min1<=min2){
            return backward;
        }
        return forward;
    }

    // check if num contain 7 and 9
    public boolean checkMagicNumber(int num){
        boolean sevenPresent=false;
        boolean ninePresent=false;
    while (num>0){
        if(num%10==7){
            sevenPresent= true;
        }
        if(num%10==9){
            ninePresent = true;
        }
        num=num/10;
    }

        return sevenPresent&ninePresent;
    }
}
