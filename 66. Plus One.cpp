class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        
        int n=digits.size();
        
        if(n==1&&digits[0]<9)
        {
            digits[0]++;
            return digits;
        }
        
        int flg=1;
        for(int i=0;i<n;i++)
        {
            if(digits[i]!=9)
                flg=0;
        }
        
        if(flg)
            {
                for(int i=1;i<n;i++)
                {
                    if(digits[i]==9)
                        digits[i]=0;
                }
                
                digits[0]=1;
                digits.push_back(0);
            
                return digits;
            }
        
    
        if(digits[n-1]==9)
        {
             while(n)
            {
            if(digits[n-1]==9)
            {
                digits[n-1]=0;
                
                if(digits[n-2]!=9)
                {
                    digits[n-2]++;
                    break;
                }
                
                n--;
            }
            }
        }
        else
        {
            digits[n-1]++;
        }
        
       
        
        return digits;
        
    }
};
