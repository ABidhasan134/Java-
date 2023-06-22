public class AddElement {

    public static void main(String[] args) {
        int i,j;
        int[] arr = {10, 20, 40, 50, 60, 70};
        int valueToInsert = 40;
        int insertIndex = 2;

        int[] newArray = new int[arr.length + 1];

        for( i=0,j=0;i<newArray.length;i++,j++)
        {
            if(i==insertIndex)
            {
                newArray[i]=valueToInsert;
                j--;
            }
            else
            {
                newArray[i]=arr[j];
            }
        }
        for(int num:newArray)
        {
            System.out.println(num);
        }
    }
}






