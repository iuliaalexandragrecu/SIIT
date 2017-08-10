package ro.sci.carrental.Domain.domain.calendar;

/**
 * Created by iulia on 5/29/2017.
 */
public class Calendar {
    private String dateOfHire;
    private String dateOfReturn;

    /**
     * Constructor for all fields
     * @param dateOfHire
     * @param dateOfReturn
     */
    public Calendar( String dateOfHire, String dateOfReturn) {
        this.dateOfHire = dateOfHire;
        this.dateOfReturn = dateOfReturn;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }
    public void setDateOfHire(String dateOfHire) {this.dateOfHire = dateOfHire; }

    public String getDateOfReturn() {return dateOfReturn; }
    public void setDateOfReturn(String dateOfReturn){this.dateOfReturn =dateOfReturn;}

}
