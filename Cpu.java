class Cpu
{
double price;
String name;
Cpu(double p,String name1)
{
price=p;
name=name1;
}
class processor
{
int cores;
String manufact;
processor(int core,String m)
{
core=core;
manufact=m;
}
}
static class ram
{
String memory;
String manufact;
ram(String mem,String man)
{
memory=mem;
manufact=man;
}
}
public static void main(String args[])
{
Cpu c=new Cpu(1800,"intel");
Cpu.processor p=c.new processor(8,"intel");
Cpu.ram r=new Cpu.ram("18gb","crucial");
System.out.println("processor name="+c.name+"\nprocessor price="+c.price);
System.out.println("processor cores="+p.cores+"\nprocessor manufact name="+p.manufact);
System.out.println("memory capacity="+r.memory+"\nram manufact="+r.manufact);
}
}

