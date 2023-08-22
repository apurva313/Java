// Achieving method overloading using same method name with same no. of parameter but different dataTypes


class overloading_type2 {
void method(int x,int y){
int sum =x+y;
System.out.println("The sum of " +x+ "+"+y+ "is " +sum);
}
void method(double x,double y){
double sum =x+y;
System.out.println("The sum of " +x+ "+"+y+ "is " +sum);
}


public static void main(String[] args){
overloading_type2 ob =new overloading_type2();
ob.method(4,6);
ob.method(8,2);
}
}
