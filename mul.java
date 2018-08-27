class mul
{
int add(int i, int j)
{
  int k=i+j;
  
  return k;
}


int add1(int a , int b)
{
  int c=a+b;
  
  return c;
}

public static void main(String[] args)
{
  mul a = new mul();
  int z= a.add(2,3) * a.add1(4,5);
  System.out.println("Multiplication is" + z);
  
}
}
