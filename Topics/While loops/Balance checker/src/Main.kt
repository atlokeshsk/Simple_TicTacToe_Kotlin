import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Step 1: Read the initial balance
    var balance = scanner.nextInt()

    // Step 2: Read the purchase payments
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()

        // Step 3: Check if there's enough balance for this purchase
        if (balance >= purchase) {
            balance -= purchase // Deduct purchase cost from balance
        } else {
            // Not enough funds for this purchase, output the error and exit
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            return
        }
    }

    // Step 4: If all purchases are successful, output the final balance
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}
