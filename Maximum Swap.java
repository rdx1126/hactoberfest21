class Solution {
    public int maximumSwap(int num) {
         int r = num;
         ArrayList<Integer> arr = new ArrayList<>();
         while(r>0)
         {
            arr.add(r%10);
            r = r/10;   
         }
        Collections.reverse(arr);
        Map<Integer,Integer> m1 = new HashMap<>();    
        for(int i = 0; i<arr.size();i++)
        {
            m1.put(arr.get(i),i);
        }
        for(int i = 0; i<arr.size();i++)
        {
            int x = arr.get(i);
            if(x!=9)
            {
                int max = Integer.MIN_VALUE;
                int maxInd = 0;
                int flag = 0;
                for(Map.Entry<Integer, Integer> ent : m1.entrySet())
                {
                    
                    if(ent.getKey()>x&&ent.getValue()>i)
                    {
                        if(ent.getKey()>max)
                        {
                            max = ent.getKey();
                            maxInd = ent.getValue();
                            flag = 1;
                        }
                    }
                }
                if(flag==1)
                {
                    arr.set(i,max);
                    arr.set(maxInd,x);
                    break;
                }
                
                
                
                
            }

        }
        int ans = 0;
        for(int i = 0; i<arr.size();i++)
        {
            ans+= arr.get(i)*((int)Math.pow(10,arr.size()-i-1));
        }
        return ans;
    }
}
