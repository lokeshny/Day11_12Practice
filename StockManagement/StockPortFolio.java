/*
 * Desc -> Write a program to read in StockAccount Names, Number of Share, Share Price.
 * Print a StockAccount Report with the total value of each StockAccount and the total value of StockAccount.
 *
 * @author: Lokesh
 * @date: 03-05-2022
 */
package com.Bridgelab.StockManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class StockPortFolio {
    //Arraylist of StockAccount account
    ArrayList <StockAccountDetails> list = new ArrayList<>();
    //object of scanner class for user input
    Scanner scanner = new Scanner(System.in);

    /*
     * setStocks method created to set stock Information
     */
    private void setStocks() {
        System.out.println("Enter the Number of StockAccount Accounts You Want To Have: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            StockAccountDetails stockAccountDetails = new StockAccountDetails();
            setStockInfo(stockAccountDetails, i);
        }
    }

    /*
     * setStockInfo method created to set the Stock Account Details.
     */
    private void setStockInfo(StockAccountDetails stockAccountDetails, int i) {
        System.out.println("Enter the StockAccount " + (i + 1) + "Information: ");
        System.out.println("Enter the StockAccount Name: ");
        stockAccountDetails.setStockNames(scanner.next());
        System.out.println("Enter the number of Shares: ");
        stockAccountDetails.setNumOfShares(scanner.nextInt());
        System.out.println("Enter the price of each share: ");
        stockAccountDetails.setSharePrices(scanner.nextDouble());
        stockAccountDetails.getTotalValueOfShares();
        stockAccountDetails.setTotalValueOfShares(stockAccountDetails.getNumOfShares(), stockAccountDetails.getSharePrices());
        list.add(stockAccountDetails);
    }

    /*
     * getStockInfo method created to get all the stock details.
     */
    private void getStockInfo() {
        int i = 1;
        for (StockAccountDetails stockAccount : list) {
            System.out.println("Stock " + i + " Information is :");
            System.out.println("Stock Name : " + stockAccount.getStockNames());
            System.out.println("Number of Shares : " + stockAccount.getNumOfShares());
            System.out.println("Price of each Shares : " + stockAccount.getSharePrices());
            System.out.println("Total Value of Shares : " + stockAccount.getTotalValueOfShares());
            i++;
        }
    }

    public static void main(String[] args) {
        StockPortFolio stockPortfolio = new StockPortFolio();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }
}

