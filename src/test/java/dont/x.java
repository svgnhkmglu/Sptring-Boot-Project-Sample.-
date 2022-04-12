package dont;

public class x {

    public static void main(String[] args) {



        int myNumber=153; // 1 **3 + 5**3 + 3**3 == 1 +125 +27= 153
        int result=0;

        int temp=myNumber; // to find length
        int temp2=myNumber;

        int len =0;
        // this logic to find count of the digits for my number
        while (temp!=0){
            len++; // 0++ , 1++ 2++ => 3
            temp/=10; // 15 , 1 , 0
        }



        // logic to calculate armstrong value
        while (temp2 !=0) {
            int temp1=1;
            //              153 %10 = 3
            //               15 %10= 5
            //              1 %10 = 1
            int lastDigit = temp2 % 10;
            //                   3
            for (int i = 1; i <= len; i++) {
                temp1 *=  lastDigit;
                // temp1 = 3 *3  *3 *3,
                // temp1 = 5 * 5 *5
                //  temp1= 1 * 1 *1
            }

            result+=temp1; // 0+27 + 125 +1

            temp2 /=10; // 153 / 10= 15 , 15 /10 = 1 , 1/10 =0
        }

        //logic will decide if number is armstrong
        if (myNumber==result){
            System.out.println( myNumber+ " is  an armstrong number");
        }else {
            System.out.println(myNumber +" is not an armstrong number");
        }

        System.out.println("**************************");

        // //  Create a Java Program to Display Prime Numbers Between Two Intervals

        for (int i = 2; i <100 ; i++) {

            int count=0;// 0

            for (int j = 2; j <i ; j++) {

                if (i %j==0){

                    count++;
                }

            }
            if (count==0){
                System.out.println(i);
            }


        }


    }
}
