class sum
{
public static void main(String ar[])
      {
            int i;
            double s=0;
             for(i=0;i<ar.length;i++)
            {
               s=s+Double.parseDouble(ar[i]);
             }
            System.out.println("sum="+s);
      }
}
