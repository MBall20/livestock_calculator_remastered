//import java.text.SimpleDateFormat
import java.util.*


fun main(){
    println("--Calculator--")

    // Initialize Date class
    val date = Date()
    // Create variable for today and format properly
    val today = date.format(Calendar.getInstance().time)


    println(Calendar.getInstance().time)
    println("Today's date: $today\n")

    // Provide a menu to select from birth to date or birth to specified date.
    var option = true
    while (option) {
        println("1) Age as of today")
        println("2) Age for future date")
        println("3) Quit")
        println("Please select an option: ")
        val menuChoice = readLine()!!.toInt()

        // Preform option 1 calculations
        if (menuChoice == 1) {
            // Get birthdate from user
            println("Please enter birth date(yyyy-mm-dd): ")
            //readLine!! used to get user input
            val userDate = readLine()!!

            // Display results
            println(date.calculateDays(today, userDate))
            date.calculateAge(today, userDate)

            // Weight calculation
            val weight = date.calculateDays(today, userDate) * 2
            println("Estimated weight: $weight lbs")
            println("\n")
            option = true
        }

        // Preform option 2 calculations
        else if (menuChoice == 2) {
            // Birth date
            println("Please enter birth date(yyyy-mm-dd): ")
            //readLine!! used to get user input
            val birth = readLine()!!

            // Projected date
            println("Please enter desired end date(yyyy-mm-dd): ")
            //readLine!! used to get user input
            val future = readLine()!!

            // Display results
            println(date.calculateDays(birth, future))
            date.calculateAge(birth, future)

            // Weight calculation
            val weight = date.calculateDays(birth, future) * 2
            println("Estimated weight: $weight lbs")
            println("\n")
            option = true
        }

        else if (menuChoice == 3) {
            println("--END--")
            option = false
        }

        else {
            println("Invalid option, please try again.")
            println("\n")
            option = true
        }
    }

    /*
    // Display today's date
    println("Current date: " + today.current() + "\n")

    // Get birthdate from user
    println("Please enter birth date(yyyy-mm-dd): ")
    //readLine!! used to get user input
    val userDate = readLine()!!

    println("Birth date is: " + today.inputDate(userDate))
    today.calculate(today.inputDate(userDate))
*/




}