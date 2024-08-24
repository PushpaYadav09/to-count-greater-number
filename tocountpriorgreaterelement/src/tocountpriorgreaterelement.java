import java.util.*;
public class tocountpriorgreaterelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prev=arr[0];
        for(int j=1;j<n;j++){
            if(arr[j]>prev) {
                count++;
            }
                prev = arr[j];

        }
        System.out.println(count);
    }
}
