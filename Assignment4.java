
public class Assignment4 {
 
 public static void main(String[] args) {
 
  int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
   
  subsorting(arr);
  
 }
 public  static void subsorting(int arr[])
 {
  int left=0;
  int right=arr.length-1;
  for (int i = 0; i < arr.length; i++) {
   
   while(arr[left]%2==0)
   {
    left++;
   }
   while(arr[right]%2==1)
   {
    right--;
   }
   
   if(left<right)
   {
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
   }
  }
 
  System.out.println("nArray after separating even and odd numbers : ");
  for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i]+" ");
  }
 }
}
