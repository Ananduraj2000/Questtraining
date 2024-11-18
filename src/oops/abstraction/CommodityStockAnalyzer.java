package oops.abstraction;

public class CommodityStockAnalyzer extends StockAnalyzer {

    String commodityType;

    public CommodityStockAnalyzer(String stockName, String stockSymbol, int [] prices,String commodityType) {
        super(stockName, stockSymbol, prices);
        this.commodityType = commodityType;
    }

    @Override
    int findMaxPrice() {
        int max=prices[0];
        for(int price : prices) {
            if(price > max){
                max=price;
            }

        }
        return max;
    }

    @Override
    int findMinPrice() {
        int min=prices[0];
        for(int price : prices) {
            if(price < min){
                min=price;
            }
        }
        return min;

    }

    @Override
    double calculateAveragePrice() {
        int sum=0;
        for(int price : prices) {
            sum+=price;
        }
        return (double) sum / prices.length;
    }

    @Override
    int[] findLongestIncreasingTrend() {
        return new int[0];
    }

    @Override
    void displayAnalysis() {
        System.out.println("Analysis for Commodity Stock: ");
        System.out.println("Stock Name :"+stockName);
        System.out.println("Stock Symbol:"+stockSymbol);
        System.out.println("Commodity Type :"+commodityType);
        System.out.println("Highest prices :"+findMaxPrice());
        System.out.println("Lowest prices :"+findMinPrice());
        System.out.println("Average Price :"+calculateAveragePrice());

    }
}
