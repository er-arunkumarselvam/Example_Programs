class Student {

  
    // Method 1 
    public void StudentId(String name, int roll_no) //TBD
    {
            System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
    }
    // Method 2
    public void StudentId(int roll_no, String name) //TBD
    {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
    }
}
  
// Class 2
// Main class
class GFG{ //TBD
  
    public static void main(String[] args)
    {
  
        // Creating object of above class
        Student obj = new Student();
  
        // Passing name and id
        // Note: Reversing order
        obj.StudentId("Arun", 1);
        obj.StudentId(2, "Kumar");
    }
}
