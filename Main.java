package PERTEMUAN12.No2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Object> tump = new Stack<>();
        
        // Memasukkan objek ke dalam stack
        tump.push("10");
        tump.push("5");
        tump.push("7");
        
        // Mengeluarkan objek dari stack dan mencetaknya
        while (!tump.isEmpty()) {
            System.out.println(tump.pop());
        }
    }
}
