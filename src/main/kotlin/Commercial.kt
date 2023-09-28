/**
 * Commercial class
 * Will take all the commercial input from Main and manipulate it
 *
 * KMC 9/28/23
 */
import java.text.DecimalFormat

class Commercial(var propertyName1: String,
                 var multiProperty: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double,
                 var propertyName2:String = "N/A",
                 var squareFootage2:Double = 0.0,
                 var propertyName3:String = "N/A",
                 var squareFootage3:Double = 0.0,
                 var propertyName4:String = "N/A",
                 var squareFootage4:Double = 0.0,
                 var propertyName5:String = "N/A",
                 var squareFootage5:Double = 0.0,): Customer(customerName, customerPhone, customerAddress, squareFootage){
    fun comWeeklyCharges(){
        var comRate = .005
        var totsqft = squareFootage + squareFootage2 +squareFootage3 + squareFootage4 + squareFootage5
        var multiPropCharges: Double
        var charges = comRate * totsqft
        // finding what the company should charge the customer
        // and if they have multiply property: possible dicount
        if (multiProperty == true) {
            multiPropCharges = charges * .9
        } else {
            multiPropCharges = charges
        }

        // formatting the charge output
        var chargeFormat = DecimalFormat("#.##")
        var formattedCharges = chargeFormat.format(multiPropCharges)

        println("$customerName")
        println("$customerPhone")
        println("$customerAddress/n")
        println("Your first property, $propertyName1, is $squareFootage square feet.")
        println("Your first property, $propertyName2, is $squareFootage2 square feet.")
        println("Your first property, $propertyName3, is $squareFootage3 square feet.")
        println("Your first property, $propertyName4, is $squareFootage4 square feet.")
        println("Your first property, $propertyName5, is $squareFootage5 square feet.")
        println("Your weekly charges for all the properties are:")
        println("$$formattedCharges")
    }
}