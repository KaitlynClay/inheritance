/**
 * Residential class
 * Will take all the residential input from Main and manipulate it
 */
import java.text.DecimalFormat

class Residential(
    var senior:Boolean = false,
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage) {
    fun resWeeklyCharges() {
        var resRate = .006
        var seniorLabel: String
        var seniorCharges: Double
        var charges = resRate * squareFootage
        // finding what to charge the customer
        // and checking if the customer is a senior: possible discount
        if (senior == true) {
            seniorCharges = charges * .85
            seniorLabel = "is a Senior, applied 15% discount."
        } else {
            seniorCharges = charges
            seniorLabel = "is not a Senior."
        }

        // formatting the charge output
        var chargeFormat = DecimalFormat("#.##")
        var formattedCharges = chargeFormat.format(seniorCharges)

        println("$customerName $seniorLabel")
        println("$customerPhone")
        println("$customerAddress/n")
        println("Your property is $squareFootage sqft.")
        println("Your weekly charges are:")
        println("$$formattedCharges")
    }
}