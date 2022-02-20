import java.text.SimpleDateFormat
import java.time.Duration
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Date () {
    fun format (input : java.util.Date) : String{

        // initialize given date
        //val date = input
        // Create formatter to format down to yyyy-mm-dd
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        // Format current date using formatter above
        val formattedDate = formatter.format(input)

        return formattedDate.format(this)


    }
    private fun stringToDate(date : String) : LocalDate {

        // Create a converter for future use.
        val newDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE)
        return newDate
    }
    fun calculateDays (input1 : String, input2 : String) : Long{

        // stringToDate needs applied for calculations to work.
        val date1 = stringToDate(input1)
        val date2 = stringToDate(input2)

        // Preform the "math" to find the difference between the two days.
        val difference = Duration.between(date1.atStartOfDay(), date2.atStartOfDay())
        // Convert difference to days
        val answer = Math.abs(difference.toDays())

        return answer
    }


    fun calculateAge (input1 : String, input2 : String){

        // stringToDate needs applied for calculations to work.
        val date1 = stringToDate(input1)
        val date2 = stringToDate(input2)
        val period = Period.between(date1, date2)
        val years = Math.abs(period.years)
        val months = Math.abs(period.months)
        val days = Math.abs(period.days)
        println("Age is : "+years+" year, "+months+" months, "+days+" days")

    }
/*
    fun calculation (date1 : java.util.Date, date2 : java.time.LocalDate  ){

        val date1 = date1
        val date2 = date2


        val difference = date1.clone() as Calendar
        difference.add(Calendar.YEAR, date2.get(Calendar.YEAR))
        difference.add(Calendar.MONTH,date2.get(Calendar.MONTH) + 1) // Kotlin starts counting months at zero

        difference.add(Calendar.DATE, date2.get(Calendar.DATE))
        difference.add(Calendar.HOUR_OF_DAY, date2.get(Calendar.HOUR_OF_DAY))
        difference.add(Calendar.MINUTE, date2.get(Calendar.MINUTE))
        difference.add(Calendar.SECOND, date2.get(Calendar.SECOND))
        difference.add(Calendar.MILLISECOND, date2.get(Calendar.MILLISECOND))
        println("${date1.time} + ${date2.time} = ${difference.time}")
        */

    }
    /*

    val cTotal = c1.clone() as Calendar

    cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR))
    cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1) // Zero-based months
    cTotal.add(Calendar.DATE, c2.get(Calendar.DATE))
    cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY))
    cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE))
    cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND))
    cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND))

    println("${c1.time} + ${c2.time} = ${cTotal.time}")

     */



    /*
    // Current date formatting
    fun current() : String{

        val today = Calendar.getInstance().time
        // Create formatter to format down to yyyy-mm-dd
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        // Format current date using formatter above
        val currentDate = formatter.format(today)

        return currentDate
    }

    // User input date formatting
    fun inputDate(Given : String): String{

        // Create formatter to format down to yyyy-mm-dd
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        // Fun fact: Intellij can automatically convert java to Kotlin when copy and paste
        val formattedDate = formatter.parse(Given)
        val birthDate = formatter.format(formattedDate)
        //println("Birth date: $birthDate")
        return birthDate
    }

    // Calculate difference between two dates
    fun calculate(date2 : String){
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        // Fun fact: Intellij can automatically convert java to Kotlin when copy and paste
        val formatted1 = Calendar.getInstance().time
        var formatted2 = formatter.parse(date2)
        //val startDate = formatter.format(formatted1)
        //val endDate = formatter.format(formatted2)

    }

     */

