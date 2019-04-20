public class Counter {
    private boolean check;
    private int counter;
    
    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int StartingValue) {
        this(StartingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
}
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void decrease() {
        if (!(this.check)) {
            this.counter--;
        }
        
        if (this.check == true) {
            this.counter--;
            if (this.counter < 0) {
                this.counter = 0;
            }
        }

    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
        } else {
        this.counter += increaseAmount;
    }
}
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount <0) {
        } else {
        
        if (!this.check) {
            this.counter -= decreaseAmount;
        }
        
        if (this.check) {
            this.counter -= decreaseAmount;
            if (this.counter < 0) {
                this.counter = 0;
            }
        }
    }
    }
}
