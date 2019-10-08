public class Main {

    public static void main(String[] args){
	    int[]e7=countEvenAndOdd(0,9);
        System.out.println("There are "+e7[1]+" odd numbers and "+e7[0]+" even numbers in the range [0:9]");
    }

    public static int sumRange(int min,int max){
        //Exercise 1 and 2
        int result=0;
        for(int i=min;i<=max; i++){
            result=result+i;
        }
        return result;
    }

    public static int[]countEvenAndOdd(int min,int max){
        //Exercise 7
        int[]result={0,0};
        for(int i=min;i<=max;i++) {
            if((Math.abs(i)%2)==1){
                result[1]++;
            }else{
                result[0]++;
            }
        }
        return result;
    }

    public static boolean isPrime(int num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}