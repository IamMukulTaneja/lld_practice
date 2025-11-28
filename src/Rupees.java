public enum Rupees {

    RUPEE(100),
    PAISA(1),
    ATTHANII(50),
    CHAWANI(25);

private final int i;
    Rupees(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}

class Solution {

    public static void main(String[] args) {
        System.out.println(Rupees.RUPEE.getValue()+Rupees.CHAWANI.getValue());
    }
}
