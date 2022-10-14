class HumanBeing
{
int amount = 100000; 
public static void main(String[] args)
{
HumanBeing hb = new HumanBeing(); 
System.out.println(hb.amount); 
hb.trip(20000); 
}
void trip(int amount)
{
System.out.println(amount); // 20000

}
}
//When we have local and global variables with same name, precedence [preference] will be given to local variables. 


