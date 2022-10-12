class GrandMall
{
private int salary; 
int ticket_price = 120; 
int showTime = 11; 
void show(String movieName)
{
System.out.println("Showing Movie " + movieName); 
}
private void get_profit()
{
System.out.println("30% Percent Profit "); 
}
public static void main(String[] args)
{
GrandMall gm = new GrandMall();
gm.get_profit(); 
}
}
