
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int thisTotal = this.euros * 100 + this.cents;
        int decreaserTotal = decreaser.euros * 100 + decreaser.cents;

        int difference = thisTotal - decreaserTotal;
        if (difference < 0) {
            difference = 0;
        }

        int newEuros = difference / 100;
        int newCents = difference % 100;

        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
