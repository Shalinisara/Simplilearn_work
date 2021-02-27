package Methodpkg;

public class MethodChild {
	
int data=50;

public void Welcome()
{
System.out.println("Hello - Output from method withput return type");
}
public int add(int x, int y)
{
	return(x+y);
}

void change(int data)
{
	data+=100;
}
void change1 (MethodChild m)
{
	m.data+=100;
	}
}
