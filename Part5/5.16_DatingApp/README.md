## Exercise description

---

Part 1: Next day

Implement the method public void advance() that moves the date by one day. In this exercise we assume that each month has 30 day.

---

Part 2: Advance specific number of days

Implement the method public void advance(int howManyDays) that moves the date by the number of days that is given. Use the method advance() that you implemented in the previous section to help you in this.

---

Part 3: Passing of time

Let's add the possibility to advance time to the SimpleDate class. Create the method public SimpleDate afterNumberOfDays(int days) for the class. It creates a new SimpleDate object whose date is the specified number of days greater than the object that the method was called on. You may still assume that each month has 30 days. Notice that the old date object must remain unchanged!

Since the method must create a new object, the structure of the code should be somewhat similar to this:

    public SimpleDate afterNumberOfDays(int days) {
    SimpleDate newDate = new SimpleDate( ... );
    
        // do something..
    
        return newDate;
    }

The program prints:
    
    Friday of the examined week is 13.2.2015
    Friday after 1 weeks is 20.2.2015
    Friday after 2 weeks is 27.2.2015
    Friday after 3 weeks is 4.3.2015
    Friday after 4 weeks is 11.3.2015
    Friday after 5 weeks is 18.3.2015
    Friday after 6 weeks is 25.3.2015
    Friday after 7 weeks is 2.4.2015
    The date after 790 days from the examined Friday is ... try it out yourself!