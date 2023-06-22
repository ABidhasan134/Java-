public class Valuefind {
    public static void main(String []args)
    {
        int []arr={36,56,47,52,25};
        int [] newArray= new int[arr.length];
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<newArray.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}
