public class prime_number{
    void prime(int n){
        int count=0;
        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        
        }
        if(count==2){
            System.out.println("The number "+n+" is a prime!");
        }
        else{
             System.out.println("The number "+n+" is a Composite!");
        }
    }
    public static void main(String args[]){
        prime_number ob=new prime_number();
        ob.prime(100);

    }
}