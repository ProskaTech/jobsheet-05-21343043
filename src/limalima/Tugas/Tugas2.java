package limalima.Tugas;

// Created by 21343043_Fadhil Nugraha Wikarya

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        String kata1 = "", kata2 = "", kata3 = "";

        kata1 = JOptionPane.showInputDialog("Enter word 1 : ");
        kata2 = JOptionPane.showInputDialog("Enter word 2 : ");
        kata3 = JOptionPane.showInputDialog("Enter word 3 : ");

        String msg = kata1+""+kata2+""+kata3;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println(kata1+""+kata2+""+kata3);
    }
}
