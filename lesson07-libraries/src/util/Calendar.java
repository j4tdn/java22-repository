package util;

import java.lang.NullPointerException;

/**
 * This is a Calendar that is meant to be used as a utility. To come up with this class, I analyzed the gregorian calendar, and I searched the web for
 * useful, free algorithms. Then I put them together to create this version of of the Calendar.<BR>
 * <BR>
 * <B>The analyze</B><BR>
 * In my analyze of the gregorian calendar, I have come to the conclution that<BR>
 * there are 8 different types of year endings. These endings have a recurring<BR>
 * cycle of 28 years. The pattern repeats itself over 28 years, continiously.<BR>
 * <BR>
 * The pattern consists of 8 different types of year-endings. These are listed below <BR>
 * <BR>
 * <B>Type</B><BR>
 * 1 = 4 times over a period of 28 year period<BR>
 * 2 = 4 times over a period of 28 year period<BR>
 * 3 = 3 times ... <BR>
 * 4 = 4 times ... <BR>
 * 5 = 4 times ... <BR>
 * 6 = 4 times ... <BR>
 * 7 = 4 times ... <BR>
 * 8 = 1 time ... <BR>
 * <BR>
 * 
 * @author Robert Nordin, robert.nordin@bredband.net
 * @version 0.5
 * 
 */
public class Calendar {
    // ****************************************************************************
    // *** MEMBERS
    // ****************************************************************************
    // *** Type of year break; beginning with break 1980/1981 ***
    private final int types[] = { 1, 2, 3, 4, 5, 6, 1, 2, 4, 7, 5, 6, 2, 3, 4, 7, 6, 1, 2, 3, 7, 5, 6, 1, 8, 4, 7, 5 };

    // *** Week of the last week of the year and the first week of the new year ***
    private final int weeks[][] = { { 52, 1 }, { 52, 53 }, { 52, 1 }, { 52, 1 }, { 52, 1 }, { 52, 1 }, { 52, 1 }, { 52, 53 } };

    // Date of the last day of the last week and the last date of the first
    // week in the new year
    // private final int dates[][] = {{28, 4}, {27, 3}, { 2, 9}, { 1, 8},
    // {30, 6}, {29, 5}, {31, 7}, {26, 2}};

    private boolean initiated = false;
    private int year = 0;
    private int preMonths = 0;
    private int aftMonths = 0;

    // ****************************************************************************
    // *** CONSTRUCTORS
    // ****************************************************************************
    public Calendar() {
    }

    // ****************************************************************************
    public Calendar(int year) throws OutOfRangeException {
        if (!isYearValid(year)) {
            throw new OutOfRangeException(OutOfRangeException.TYPE_YEAR, "Year[" + year + "]");
        } else {
            this.year = year;
            initiated = true;
        }
    }

    // ****************************************************************************
    public Calendar(int year, int preMonths, int aftMonths) throws OutOfRangeException {
        if (!isYearValid(year)) {
            throw new OutOfRangeException(OutOfRangeException.TYPE_YEAR, "Year[" + year + "]");
        } else {
            this.year = year;
            initiated = true;
        }
        this.preMonths = ((preMonths >= 0) && (preMonths <= 12)) ? preMonths : 0;
        this.aftMonths = ((aftMonths >= 0) && (aftMonths <= 12)) ? aftMonths : 0;
    }

    // ****************************************************************************
    private boolean isYearValid(int year) {
        return ((year >= Date.MIN_YEAR) && (year <= Date.MAX_YEAR)) ? true : false;
    }

    // ****************************************************************************
    private int[] getWeeks(int type) {
        int retval[] = null;
        int arrayindex = type - 1;
        try {
            retval = weeks[arrayindex];
        } catch (Exception ex) {
            System.err.println("getWeeks(): Type is not inside valid range");
        }
        return retval;
    }

    // ****************************************************************************
    private int getType(int index) {
        int retval = types[index];
        if ((retval < 1) || (retval > 8)) {
            System.err.println("getType(): Index is not inside valid range");
        }
        return retval;
    }

    // ****************************************************************************
    private int getFirstWeek(int type) {
        int retval = 1;
        if (type == 3 || type == 4) {
            retval = 52;
        } else
            if (type == 2 || type == 8) {
                retval = 53;
            }
        return retval;
    }

    // ****************************************************************************
    private int getLastWeek(int type) {
        int retval = 52;
        if (type == 1 || type == 5 || type == 6) {
            retval = 1;
        } else
            if (type == 2 || type == 8) {
                retval = 53;
            }
        return retval;
    }

    // ****************************************************************************
    public String intToWeekday(int day, boolean longVersion) {
        String retval = "";
        /*
        if (day == 1) {
            retval = (longVersion) ? "Monday" : "Mon";
        } else
            if (day == 2) {
                retval = (longVersion) ? "Tuesday" : "Tue";
            } else
                if (day == 3) {
                    retval = (longVersion) ? "Wednesday" : "Wed";
                } else
                    if (day == 4) {
                        retval = (longVersion) ? "Thursday" : "Thu";
                    } else
                        if (day == 5) {
                            retval = (longVersion) ? "Friday" : "Fri";
                        } else
                            if (day == 6) {
                                retval = (longVersion) ? "Saturday" : "Sat";
                            } else
                                if (day == 7) {
                                    retval = (longVersion) ? "Sunday" : "Sun";
                                } else {
                                    System.err.println("intToWeekday(): Day is not inside valid range");
                                }
         */
        switch (day) {
        case 1: 
            retval = (longVersion) ? "Monday" : "Mon";
            break;
        case 2: 
            retval = (longVersion) ? "Tuesday" : "Tue";
            break;
        case 3: 
            retval = (longVersion) ? "Wednesday" : "Wed";
            break;
        case 4: 
            retval = (longVersion) ? "Thursday" : "Thu";
            break;
        case 5: 
            retval = (longVersion) ? "Friday" : "Fri";
            break;
        case 6: 
            retval = (longVersion) ? "Saturday" : "Sat";
            break;
        case 7: 
            retval = (longVersion) ? "Sunday" : "Sun";
            break;
        default: 
            System.err.println("intToWeekday(): Day is not inside valid range");
        }           
        return retval;
    }

    // ****************************************************************************
    private int getYearType(int year) {
        int retval = -1;
        if (year >= 1980) {
            retval = getType(((year - 1980) % 28));
        } else
            if (year == 1979) {
                retval = 5;
            } else {
                System.err.println("getYearType(): Year is not inside valid range");
            }
        return retval;
    }

    /**
     * Compute the sequential number of a day in the year (1-Jan=1, 31-Dec=365/366). The algorithm used: J.D. Robertson: Remark on Algorithm 398,
     * Comm. ACM 13, 10 (Oct. 1972), p. 918
     * 
     * @param date
     *            a date of the day you query about
     * @return returns an integer between 1 and 365/366. 366 if it is a leapyear.
     * @throw NullPointerException if the date is null.
     */
    public int getDayInYear(Date date) throws NullPointerException {
        if (date == null)
            throw new NullPointerException("Date cannot be null");
        int y = date.getYear();
        int m = date.getMonth();
        int d = date.getDay();
        int lm = (m + 10) / 13;
        return (int) (((long) 3055 * (long) (m + 2)) / 100 - 2 * lm - 91
                + (1 - (y - (y / 4) * 4 + 3) / 4 + (y - (y / 100) * 100 + 99) / 100 - (y - (y / 400) * 400 + 399) / 400) * lm + d);
    }

    /**
     * Returns an array of dates that conforms to a year and a week.
     * 
     * @param year
     *            the year in the form eg. 1980. Must be within Date.MIN_YEAR and Date.MAX_YEAR.
     * @param week
     *            the week. Must be less than 54
     * @return returns a full week of valid ISODates if inparameters are within the given range. returns a full week of null pointers if not.
     */
    public Date[] getWeekDates(int year, int week) {
        Date retval[] = new Date[7];
        if ((isYearValid(year)) && ((week > 0) && (week < 54))) {
            int dayCounter = 0;
            for (int i = 1; i < 13; i++) {
                for (int j = 1; j <= Date.getDaysInMonth(year, i); j++) {
                    Date tmp = new Date(year, i, j);

                    if (this.getWeekNumber(tmp) == week) {
                        retval[dayCounter] = tmp;
                        if (dayCounter == 7) {
                            i = 13;
                            j = 31;
                        }
                        if (dayCounter < 6) {
                            dayCounter++;
                        }
                    }
                }
            }
        }
        return retval;
    }

    /**
     * Returns the weeknumber of the given date.
     * 
     * @param date
     *            a date that you want to know in what week it is.
     * @return returns the weeknumber as an integer.
     * @throws NullPointerException
     *             if the parameter is null.
     */
    public int getWeekNumber(Date date) throws NullPointerException {
        int retval = -1;
        if (date == null)
            throw new NullPointerException("ISODate cannot be null");
        // *** Incoming data ***
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();

        if (isYearValid(year)) {
            int targetDay = getDayInYear(date);
            int firstWeek = getFirstWeek(getYearType((year - 1)));
            int lastWeek = getLastWeek(getYearType(year));
            Date oneone = new Date(year, 1, 1);

            int firstDay = getDayInWeek(oneone);
            int dayCounter = 0;
            int weekCounter = firstWeek;
            int dayInWeek = firstDay;

            while (dayCounter != targetDay) {
                if (dayInWeek == 8) {
                    dayInWeek = 1;
                    if ((weekCounter > 51) && (dayCounter < 10)) {
                        weekCounter = 1;
                    } else
                        if ((dayCounter > 360) && (weekCounter > lastWeek)) {
                            weekCounter = lastWeek;
                        } else {
                            weekCounter++;
                        }
                }
                dayCounter++;
                dayInWeek++;
            }
            retval = weekCounter;
        }
        return retval;
    }

    /**
     * Returns an integer that tells you what day of the week the date specifies. The algorithm used is Zeller's congruence for the Gregorian
     * calendar.
     * 
     * @param date
     *            a date that points out the day you want to know the weekday of.
     * 
     * @return returns the weekday in the form of an integer. 1=Monday, 2=Tuesday...
     * @throws NullPointerException
     *             if the parameter is null.
     */
    public int getDayInWeek(Date date) throws NullPointerException {
        if (date == null)
            throw new NullPointerException("ISODate cannot be null");
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();
        if (month < 3) {
            month += 12;
            year--;
        }
        return ((13 * month + 3) / 5 + day + year + year / 4 - year / 100 + year / 400) % 7 + 1;
    }
}