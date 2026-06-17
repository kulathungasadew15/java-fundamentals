import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A simple Currency Converter application that converts amounts between 
 * USD, EUR, GBP, JPY, and LKR.
 */
public class CurrencyConverter {

    // Using a Map to store exchange rates relative to USD (Base Currency)
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);       // Base
        exchangeRates.put("EUR", 0.93);      // Euro
        exchangeRates.put("GBP", 0.79);      // British Pound
        exchangeRates.put("JPY", 158.0);     // Japanese Yen
        exchangeRates.put("LKR", 302.50);    // Sri Lankan Rupee
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== 💱 Welcome to the Currency Converter 💱 ==========");
        System.out.println("Available Currencies: " + exchangeRates.keySet());
        System.out.println("---------------------------------------------------------");

        try {
            // Get source currency
            System.out.print("Enter the currency you want to convert FROM (e.g., USD): ");
            String fromCurrency = scanner.next().toUpperCase();

            // Get target currency
            System.out.print("Enter the currency you want to convert TO (e.g., LKR): ");
            String toCurrency = scanner.next().toUpperCase();

            // Validate currencies
            if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
                System.out.println("❌ Error: One or both currencies are not supported.");
                return;
            }

            // Get amount
            System.out.print("Enter the amount to convert: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("❌ Error: Invalid amount. Please enter a valid number.");
                return;
            }
            double amount = scanner.nextDouble();

            // Perform calculation
            double convertedAmount = convert(amount, fromCurrency, toCurrency);

            // Display results
            System.out.println("---------------------------------------------------------");
            System.out.printf("💰 %.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
            System.out.println("=========================================================");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Converts an amount from one currency to another using USD as a base.
     */
    private static double convert(double amount, String from, String to) {
        // Convert source currency to USD first, then to target currency
        double amountInUSD = amount / exchangeRates.get(from);
        return amountInUSD * exchangeRates.get(to);
    }
}
