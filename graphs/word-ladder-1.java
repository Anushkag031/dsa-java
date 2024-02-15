class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //bfs traversal

        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(beginWord,1));

        Set<String> set=new HashSet<String>();

        int len = wordList.size();

// adding all the elements in the set
        for(String str: wordList){
            set.add(str);
        }
        set.remove(beginWord); //remove start word

// bfs traversal begins
        while (!q.isEmpty())
        {
            String word=q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if(word.equals(endWord)==true) return steps;

            for(int i=0; i<word.length(); i++)
            {
                for(char ch='a'; ch<='z'; ch++)
                {
                    char arr[]=word.toCharArray();
                    arr[i]=ch;

                    String newWord= new String(arr);

                    if(set.contains(newWord)==true)
                    {
                        set.remove(newWord);
                        q.add(new Pair(newWord,steps+1));
                    }
                }
            }

        }
        return 0;
    }
    class Pair{
        String first;
        int second;
        Pair(String first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
}
