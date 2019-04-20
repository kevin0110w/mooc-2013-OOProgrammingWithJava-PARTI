public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int differenceInYears = 0;
        int minusAYear = 0;
//        differenceInYears = Math.abs(this.year - comparedDate.year);
//        return differenceInYears;
        
//        if (this.day >= comparedDate.day && this.month >= comparedDate.month) {
//            differenceInYears = this.year - comparedDate.year;
//        } else if (this.day <= comparedDate.day || this.month <= comparedDate.month) {
//            differenceInYears = this.year - comparedDate.year - 1;
//        }
//         return Math.abs(differenceInYears);
        if (this.year > comparedDate.year) {
//            if (this.day <= comparedDate.day && this.month <= comparedDate.month) {
//                differenceInYears = this.year - comparedDate.year - 1;
//            } else if (this.day >= comparedDate.day && this.month >= comparedDate.month) {
//                differenceInYears = this.year - comparedDate.year;
//            } else if (this.month >= comparedDate.month) {
//                differenceInYears = this.year - comparedDate.year;
//            } else if (this.day <= comparedDate.month && this.month >= comparedDate.month) {
//                differenceInYears = this.year - comparedDate.year;
//            }
            if (this.month < comparedDate.month) {
                minusAYear = 1;
            } else if (this.month == comparedDate.month && this.day < comparedDate.day) {
                minusAYear = 1;
            }
            return this.year - comparedDate.year - minusAYear;
        }
        
        if (comparedDate.year > this.year) {
            if (comparedDate.month < this.month) {
               minusAYear = 1;
            } else if (comparedDate.day < this.day && comparedDate.month == this.month) {
                minusAYear = 1;
            }
            return comparedDate.year - this.year - minusAYear;
        }
          return differenceInYears;
    }
}

    
