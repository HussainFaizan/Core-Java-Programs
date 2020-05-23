public class NewKeyword  
{ 
    String name = "about_java"; 
     public void m1() {
        System.out.println("This is Method M1");
    }
    public static void main(String[] args)  
    { 
       
        NewKeyword obj = new NewKeyword(); 
        System.out.println(obj.name); 
        obj.m1();
    } 
} 