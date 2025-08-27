import java.util.*;

public class Search {
    public static void main(String[] args) {
        int key=4;
        int a[]={32,1,2,3,4};
        for(int i=0;i<5;i++)
        {
            if(a[i]==key)
            {
                System.out.print("\nFound");
                break;
            }
            else
            {
                System.out.print("\nNot Found");
                break;
            }
        }
    }
}