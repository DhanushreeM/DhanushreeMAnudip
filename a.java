class a
{
public static void main(String[]args)
{
char letter='a';
int ascii=letter;//Automatic Type conversion
System.out.println("ASCII value of="+letter+"is:"+ascii);
char ex=(char)(ascii-32);//manual type conversion
System.out.println("from ASCII value to="+ascii+"letter is:"+ex);
}
}