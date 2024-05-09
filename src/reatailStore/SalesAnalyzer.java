package reatailStore;
import java.util.ArrayList;
import java.util.List;

public class SalesAnalyzer {
    private List<Double> salesData;

    public SalesAnalyzer() {
        salesData = new ArrayList<>();
    }

    public void addSale(double saleAmount) {
        salesData.add(saleAmount);
    }


    public double calculateTotalSales() {
        double total = 0.0;
        for (double sale : salesData) {
            total += sale;
        }
        return total;
    }

   
    public double calculateAverageSales() {
        if (salesData.isEmpty()) {
            return 0.0; 
        }
        double total = calculateTotalSales();
        return total / salesData.size();
    }

   
    public double findHighestSale() {
        if (salesData.isEmpty()) {
            return 0.0; 
        }
        double highest = salesData.get(0);
        for (double sale : salesData) {
            if (sale > highest) {
                highest = sale;
            }
        }
        return highest;
    }

    
    public double findLowestSale() {
        if (salesData.isEmpty()) {
            return 0.0;
        }
        double lowest = salesData.get(0);
        for (double sale : salesData) {
            if (sale < lowest) {
                lowest = sale;
            }
        }
        return lowest;
    }

   
    public static void main(String[] args) {
        SalesAnalyzer analyzer = new SalesAnalyzer();

     
        analyzer.addSale(100.0);
        analyzer.addSale(200.5);
        analyzer.addSale(300.0);
        analyzer.addSale(50.0);

        
        double totalSales = analyzer.calculateTotalSales();
        System.out.println("Total Sales: " + totalSales);

    
        double averageSales = analyzer.calculateAverageSales();
        System.out.println("Average Sales: " + averageSales);

        double highestSale = analyzer.findHighestSale();
        System.out.println("Highest Sale: " + highestSale);

        double lowestSale = analyzer.findLowestSale();
        System.out.println("Lowest Sale: " + lowestSale);
    }
}