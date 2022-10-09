class Home
{
public static void main(String[] args) // args
{
Home home = new Home(); 
double amount = home.read_eb(100); //300.0
return; 
}
double read_eb(int consumed_units)
{   
float units = 150.8f; 
System.out.println("In Line 14 "+ units); 
int amount = (int)units * 2; //Type Casting: 
System.out.println("You have to pay "+ amount);
return units; 
}

}
