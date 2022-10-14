class Boy
{
public static void main(String[] args)
{
Boy raja = new Boy(); 
raja.go(); 
raja.purchase();
raja.give_cash();
}
void go() //instance - object - non-static method
{
    purchase(); 
}
void purchase()
{
    int amount; // value:
    give_cash(); 
}
void give_cash()
{
}

}
