
// finds and prints the maximum integer value from the command line arguments.
//By: Apurva Kumar

class max {
    void max(String a[]) {
        int m = 0, i;
        for (i = 0; i < a.length; i++) {
            if (m < Integer.parseInt(a[i])) {
                m = Integer.parseInt(a[i]);
            }
        }
        System.out.println(m);
    }
}

class Demo {
    public static void main(String args[]) {
        max c = new max();
        c.max(args);
    }
}
