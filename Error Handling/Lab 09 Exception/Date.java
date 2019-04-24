//Date.java
public class Date {

    private int dMonth; // variable to store the month
    private int dDay; // variable to store the day
    private int dYear; // variable to store the year

    /**
     * default constructor - sets dMonth=1, dDay=1, and dYear=1900
     */
    public Date() {
        dMonth = 1;
        dDay = 1;
        dYear = 1900;
    }

    /**
     * parameterized constructor - sets dMonth, dDay, and dYear to user
     * specified values
     *
     * @param month
     *            value to be stored in dMonth
     * @param day
     *            value to be stored in dDay
     * @param year
     *            value to be stored in dYear
     */
    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    /**
     * setDate - stores month, day, and year in dMonth, dDay, and dYear
     * respectively be calling each of the setMethods defined
     *
     * @param month
     *            value to be stored in dMonth
     * @param day
     *            value to be stored in dDay
     * @param year
     *            value to be stored in dYear
     */
    public void setDate(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    /**
     * setMonth - stores month in dMonth
     *
     * @param month
     *            the value to be stored in dMonth
     */
    public void setMonth(int month) throws DateException{
       if(month >= 1 && month <= 12) {
           dMonth = month;
       }
       else
           throw new DateException("Invalid Month: month out of range");
    }

    /**
     * setDay - stores day in dDay
     *
     * @param day
     *            the value to be stored in dDay
     */
    public void setDay(int day) {
        if(day >= 1 && day <= 31){
            dDay = day;
        }
        else
            throw new RuntimeException("Invalid Day: Day out of range");
    }

    /**
     * setYear - stores year in dYear
     *
     * @param year
     *            the value to be stored in dYear
     */
    public void setYear(int year) {
        dYear = year;
    }

    /**
     * getMonth - accessor for dMonth
     *
     * @return returns the value stored in dMonth
     */
    public int getMonth() {
        return dMonth;
    }

    /**
     * getDay - accessor for dDay
     *
     * @return returns the value stored in dDay
     */
    public int getDay() {
        return dDay;
    }

    /**
     * getYear - accessor for dYear
     *
     * @return returns the value stored in dYear
     */
    public int getYear() {
        return dYear;
    }

    /**
     * toString - returns the month, day, and year in the format: mm-dd-yyyy;
     * leading zeros are NOT contained within the string
     *
     * @return a String containing the date in month-day-year format
     */
    public String toString() {
        return (dMonth + "-" + dDay + "-" + dYear);
    }
}

