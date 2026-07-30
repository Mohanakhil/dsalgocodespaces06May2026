public class SquareRoot28{
    public static int getSqRt(int x){
      int i=1;
      while((i*i)<=x){
        i=i+1;
      }
      return i-1;
    }

    public static int getSquareRootOptimized(int ele){
        int left=1,right=ele;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sqr=mid*mid;
            if(sqr==mid){
                return mid;
            }
            else if(sqr>ele){
                right=mid-1;
            }
            else if(sqr<ele){
                left=mid+1;
                //similar to finding the last occurrence of required value
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int x=35;
        int result=getSqRt(x);
        System.out.println("sqrt of given no is "+result);

        //using optimum sol using binary search
        result=getSquareRootOptimized(x);
        System.out.println("sqrt of given no using binary search is "+result);
    }
}