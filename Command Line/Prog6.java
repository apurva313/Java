//to print prime numbers within the range from a to b, inclusive.
//By: Apurva Kumar

class Prog6 {

    void msg(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Prog6 ob = new Prog6();
        ob.msg(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
