class Test
{
    int no1, no2;
    
    Test(int no1, int no2)
    {
        this.no1 = no1;
        this.no2 = no2;
    }
    
    /* return true if object is equal to invoking object*/
    boolean equalTo(Test object)
    {
        if(object.no1 == no1 && object.no2 == no2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class JavaProgram
{   
    public static void main(String args[])
    {
        
        Test object1 = new Test(100, 22);
        Test object2 = new Test(100, 22);
        Test object3 = new Test(-1, -1);
        
        System.out.println("object1 == object2 : " + object1.equalTo(object2));
        System.out.println("object1 == object3 : " + object1.equalTo(object3));
        
    }
}
