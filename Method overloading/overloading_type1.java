// Achieving method overloading using same method name but differnt parameters


class overloading_type1 {
void method(int x,int y){
int sum =x+y;
System.out.println("The sum of " +x+ "+"+y+ "is " +sum);
}

void method(int x,int y,int z){
int add=x+y+x;
System.out.println("The sum of " +x+ "+"+y+"+"+z+ "is " +add);
}
public static void main(String[] args){
overloading_type1 ob =new overloading_type1();
ob.method(4,6);
ob.method(8,2,5);
}
}
