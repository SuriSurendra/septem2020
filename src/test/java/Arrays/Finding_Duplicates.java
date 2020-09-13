package Arrays;

public class Finding_Duplicates {

    public static void main(String[] args)
    {
        int arr[]= new int[]{1,2,5,2,1,8};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if (arr[i]==arr[j])

                    System.out.println(arr[j]);

            }
        }

    }
}
