class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i : arr1)
        set.add(i);
        
        for(int j : arr2)
        set.add(j);
        
        for(int x:set)
        {
            list.add(x);
        }
        Collections.sort(list);
        return list;
    }
}
