class Rectangle 
{
double length,breadth; 
public void setData()
{ 
length =12.48; 
breadth=13; 
} 
public void getArea()
{
double area=length*breadth;
System.out.println("area of rectangle is" +area);
}
public static void main(String args[])
{
Rectangle obj=new Rectangle();
obj.setData();
obj.getArea();
}
}
       
