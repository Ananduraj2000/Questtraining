package oops.abstraction;

public class EquityStockAnalyzer extends StockAnalyzer {

    String sector;

    public EquityStockAnalyzer(String stockName, String stockSymbol, int [] prices,String sector) {
        super(stockName, stockSymbol, prices);
        this.sector = sector;
    }


    //method to find maximum prices
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


    //method to find minimum price
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

        System.out.println("Analysis for equity stock:");
        System.out.println("Stock name: " + stockName);
        System.out.println("Stock symbol: " + stockSymbol);
        System.out.println("Sector: " + sector);
        System.out.println("Highest price: " + findMaxPrice());
        System.out.println("Lowest price: " + findMinPrice());
        System.out.println("Average price: " + calculateAveragePrice());

    }
}
