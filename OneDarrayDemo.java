import java.util.Scanner;
public class OneDarrayDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
        }
		
        System.out.println("Array Elements are::");
		for(int i = 0; i < n; i++)
		{
			System.out.println(marks[i]);
		}
    }
}


