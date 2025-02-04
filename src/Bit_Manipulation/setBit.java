package Bit_Manipulation;

public class setBit {
    public static void main(String[] args) {
        int n = 5;   // 0101
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
//        bit mask =  0010
//        n        =  0101
//        newNumber=  0111 -->(7)
        System.out.println(newNumber);

    }
}