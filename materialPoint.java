public class materialPoint 
{
private int m; //masa
public pktMat()
{ //konstruktor domyślny
this.m=1;
}
public pktMat(int a)
{ //konstruktor z parametrem
if(a>0)
{
this.m=a;
}
else
{
System.out.println("Masa musi byc wieksza od zera");
}
}
public int getMasa()
{ 
return this.m;
}
public int zmienMase(int c)
{
this.m = c;
return this.m;
}
public int momBez()
{
int i=0;
return i;
}
public int steiner(int d)
{
int is;
is=momBez()+this.m*d*d;
return is;
}
public void opis()
{
System.out.println("Punkt materialny");
}
}
