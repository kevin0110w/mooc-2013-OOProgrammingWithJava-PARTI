import java.util.Calendar;

public class Person {
    public int dayCurrent =  Calendar.getInstance().get(Calendar.DATE);
    public int monthCurrent = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    public int yearCurrent =  Calendar.getInstance().get(Calendar.YEAR);
       
    public MyDate dateCurrent = new MyDate(dayCurrent, monthCurrent, yearCurrent);
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int dayCurrent =  Calendar.getInstance().get(Calendar.DATE);
        int monthCurrent = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int yearCurrent =  Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate dateCurrent = new MyDate(dayCurrent, monthCurrent, yearCurrent);
        
        
        return this.birthday.differenceInYears(dateCurrent);
    }
    
    public Person(String name) {
        this.name = name;
        birthday = new MyDate(dayCurrent, monthCurrent, yearCurrent);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        boolean isOlderThan =  false;
        int birthdayOfPerson = this.birthday.differenceInYears(dateCurrent);
        int comparedPerson = compared.age();
        
        if (birthdayOfPerson > comparedPerson) {
            isOlderThan =  true;
        }
        else {
        isOlderThan = false;
    }
        return isOlderThan;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
