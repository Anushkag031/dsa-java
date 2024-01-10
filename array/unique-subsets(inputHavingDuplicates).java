class solve
{
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
       Arrays.sort(arr);
        ArrayList<Integer> curr=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        rec(arr,0,curr,ans);
        return ans;

    }
    public static void rec(int [] arr, int i,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans )
    {
        ans.add(new ArrayList<>(curr));

        for (int j = i; j < arr.length; j++) {
            // Skip duplicates
            if (j > i && arr[j] == arr[j - 1]) {
                continue;
            }

            curr.add(arr[j]);
            rec(arr, j + 1, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
 
