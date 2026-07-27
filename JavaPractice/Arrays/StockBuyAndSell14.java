public class StockBuyAndSell14 {

    public static int getMaxProfit1(int[] a){
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                profit=profit+(a[i]-a[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] a=new int[]{1,5,3,8,12};

        int maxProfit=getMaxProfit1(a);
        System.out.println("max profit is "+maxProfit);
    }
}
