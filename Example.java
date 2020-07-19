public class Main {

    public static void main(String[] args) {
        // 1.print numbers
        printNumber(5);

        // 2.cat eyes
        System.out.println("Cat eyes: "+catEyes(7));

        // 3.power
        System.out.println("powe: "+power(2,3));

        // 4.factorial
        System.out.println("factorial of 4 is: "+factorial(5));

        // 5.fibonacci
        System.out.println("fibonacci value is: "+fibonacci(6));

        // 6.mobile speakers
        System.out.println("Mobile speakers: "+mobileSpeakers(4));

        // 7.sum
        System.out.println("sum of digits:" +sum(135));

        // 8.counting 5
        System.out.println("Counting 5: "+count5(233515));

        // 9.binary search
        int [] array = {11,34,56,77,88,99,123,456,2345};
        System.out.println("Binary search: "+binarySearch(array,99,0,array.length-1));
    }
    public static void printNumber(int num){
        if(num==0){
            return;
        }else {
            System.out.println(num);
            printNumber(num - 1);
        }
    }
    public static int catEyes(int cats){
        if(cats==0){
            return 0;
        }else {
            return 2 + catEyes(cats-1);
        }
    }
    public static int power(int base,int num){
        if (num == 1){
            return base;
        }else{
            return base * power(base,num-1);
        }
    }
    public static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }else {
            return num * factorial(num - 1);
        }
    }
    public static int fibonacci(int num){
        if (num == 0){
            return 0;
        }else if (num == 1) {
            return 1;
        }else {
            return fibonacci(num-1)+fibonacci(num-2) ;
        }
    }
    public static int mobileSpeakers(int mobiles){
        if (mobiles==0){
            return 0;
        }else {
            if (mobiles % 2==0) {
                return 2 + mobileSpeakers(mobiles-1);
            }else {
                return 1 + mobileSpeakers(mobiles-1);
            }
        }
    }
    public static int sum(int num){
        if (num <= 9){
            return num;
        }else {
            return num % 10 + sum(num / 10);
        }
    }
    public static int count5(int num){
        if (num <= 9) {
            if (num == 5){
                return 1;
            }else {
                return 0;
            }
        }else {
            if (num % 10 == 5){
                return 1 + count5(num/10);
            }else {
                return 0 + count5(num/10);
            }
        }
    }
    public static int binarySearch(int[] array,int key,int start,int end){
        if (start <= end){
            int middle = (start+end)/2;
            if (array[middle] > key){
                return binarySearch(array,key,start,middle-1);
            }else if(array[middle] < key){
                return binarySearch(array,key,middle+1,end);
            }else {
                return middle;
            }
        }
        else {
            return -1;
        }
    }
}
