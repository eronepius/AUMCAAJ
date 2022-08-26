public class exercises {
    void fibanocci(int n){
        int a=0, b=1;
        for(int i=0;i<n;i++){
            System.out.print(" " + a);
            b = b+a;
            a = b-a;
        }
    }

    boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

    boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<n;i++)
            if (s.charAt(i) != s.charAt(n-1-i))
                return false;
        return true;
    }

    int factorial(int n){
        int fact = 1;
        while(n>1){
            fact*=n;
            n--;
        }
        return fact;
    }

    boolean isAmstrong(int n){
        int num = n;
        int sum = 0;
        while(num > 0){
            int d = num%10;
            sum += (d*d*d);
            num = num/10;
        }
        return(n == sum);
    }

    int numRev(int n){
        int num = 0;
        while(n > 0){
            num = num*10 + (n%10);
            n/=10;
        }
        return num;
    }

    void numToWord(int n){
        System.out.println(n);
        String[] ones = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        String[] teens = new String[] {
                "ten",      "eleven",  "twelve",
                "thirteen",  "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };
        String[] tens = new String[] {
                "",      "",      "twenty",  "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        if(n<10)
            System.out.println(ones[n]);
        else if(n<20)
            System.out.println(teens[n-10]);
        else if(n<99)
            System.out.println(tens[n/10] + ones[n%10]);
        else if(n == 100)
            System.out.println("Hundred");
        else
            System.out.println("Number out of range");
    }

    int nthPrime(int n){
        int count = 0, i = 2;
        while(count < n){
            if(isPrime(i))
                count++;
            i++;
        }
        return (i-1);
    }

    void altPrimeNum(int n){
        int count = 0, i = 2;
        while(i <= n){
            if(isPrime(i)){
                count++;
                if(count%2 != 0)
                    System.out.println(i);
            }
            i++;
        }
    }

    void posOrNeg(int n){
        if(n>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    void altEvenNum(int n){
        int count = 0, i = 0;
        while(i <= n){
            if(i%2 == 0){
                count++;
                if(count%2 != 0)
                    System.out.println(i);
            }
            i++;
        }
    }

    void altOddNum(int n){
        int count = 0, i = 0;
        while(i <= n){
            if(i%2 != 0){
                count++;
                if(count%2 != 0)
                    System.out.println(i);
            }
            i++;
        }
    }

    int sumTillN(int n){
        int sum = 0;
        for(int i=1;i<=n;i++)
            sum+=i;
        return(sum);
    }

    public static void main(String[] args) {
        exercises e = new exercises();
        System.out.println("Fibanocci :");
        e.fibanocci(10);
        System.out.println("\n" + Integer.toString(53) + " Is Prime : " + e.isPrime(53));
        System.out.println("\n" + "madam" + " Is Palindrome : " + e.isPalindrome("madam"));
        System.out.println("Factorial of " + Integer.toString(5) + " is " + Integer.toString(e.factorial(5)));
        System.out.println("\n" + Integer.toString(153) + " Is Amstrong Number : " + e.isAmstrong(153));
        System.out.println("\nReverse of 123 is " + Integer.toString(e.numRev(123)));
        System.out.println("\n5th prime number is " + Integer.toString(e.nthPrime(5)));
        System.out.println("Alternate prime numbers till 50:");
        e.altPrimeNum(50);
        System.out.print("-45 is :" );
        e.posOrNeg(-45);
        System.out.println("Alternate even numbers till 10:");
        e.altEvenNum(10);
        System.out.println("Alternate odd numbers till 10:");
        e.altOddNum(10);
        System.out.println("\nSum of natural number till 10 is " + Integer.toString(e.sumTillN(10)));
        e.numToWord(5);
        e.numToWord(12);
        e.numToWord(24);
        e.numToWord(48);
        e.numToWord(95);
        e.numToWord(100);
//        e.numToWord(105);
    }
}
