/**
 * Main file
 * Gets user input about the job
 *
 * KMC 9/28/23
 */

fun main(args: Array<String>) {
    // option menu
    println("Please enter the number of your choice:")
    println("1. Residential Customer")
    println("2. Commercial Customer")
    println("3. Done")
    var userInput = readLine()?.toInt()
    if (userInput == 1) {
        // input for Residential class
        print("Enter the Residential Customer's name: ")
            var customerName = readLine()!!
            print("Enter customer's phone number: ")
            var customerPhone = readLine()!!
            print("Enter customer's address: ")
            var customerAddress = readLine()!!.toString()
            print("Enter the property square footage: ")
            var squareFootage = readLine()!!.toDouble()
            print("Is the customer a senior? (true/false): ")
            var senior = readLine()!!.toBoolean()
            var residentCustom = Residential(senior, customerName, customerPhone, customerAddress, squareFootage)
            residentCustom.resWeeklyCharges()
    } else if (userInput == 2) {
        // input for Commercial class
        print("Enter the Commercial Customer's name: ")
                var customerName = readLine()!!.toString()
                print("Enter customer's phone number: ")
                var customerPhone = readLine()!!.toString()
                print("Enter customer's address: ")
                var customerAddress = readLine()!!.toString()
                print("Is this a multi-property customer? (true/false): ")
                var multiProperty = readLine()!!.toBoolean()
                print("Enter the name of the first property: ")
                var propertyName1 = readLine()!!.toString()
                print("Enter the property square footage: ")
                var squareFootage = readLine()!!.toDouble()
                print("Enter the name of the second property: ")
                var propertyName2 = readLine()!!.toString()
                print("Enter the property square footage: ")
                var squareFootage2 = readLine()!!.toDouble()
                print("Enter the name of the third property: ")
                var propertyName3 = readLine()!!.toString()
                print("Enter the property square footage: ")
                var squareFootage3 = readLine()!!.toDouble()
                print("Enter the name of the fourth property: ")
                var propertyName4 = readLine()!!.toString()
                print("Enter the property square footage: ")
                var squareFootage4 = readLine()!!.toDouble()
                print("Enter the name of the fifth property: ")
                var propertyName5 = readLine()!!.toString()
                print("Enter the property square footage: ")
                var squareFootage5 = readLine()!!.toDouble()
                var commercialCustomer = Commercial(propertyName1, multiProperty, customerName, customerPhone, customerAddress, squareFootage,
                    propertyName2, squareFootage2, propertyName3, squareFootage3, propertyName4, squareFootage4, propertyName5, squareFootage5)
                commercialCustomer.comWeeklyCharges()
    } else if (userInput == 3) {
        print("Thank you for your business!")
    } else {
        print("I'm sorry, please enter a valid option.")
    }
}