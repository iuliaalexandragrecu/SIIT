package ro.sci.carrental.Domain.domain.calendar;

/**
 * Created by iulia on 5/29/2017.
 */
public class Calendar {
    private int days;
    private String dateOfHire;
    private String dateOfReturn;

    /**
     * Constructor for all fields
     * @param days
     * @param dateOfHire
     * @param dateOfReturn
     */
    public Calendar(int days, String dateOfHire, String dateOfReturn, boolean onLoan) {
        this.days = days;
        this.dateOfHire = dateOfHire;
        this.dateOfReturn = dateOfReturn;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {this.days= days;}

    public String getDateOfHire() {
        return dateOfHire;
    }
    public void setDateOfHire(String dateOfHire) {this.dateOfHire = dateOfHire; }

    public String getDateOfReturn() {return dateOfReturn; }
    public void setDateOfReturn(String dateOfReturn){this.dateOfReturn =dateOfReturn;}

}
