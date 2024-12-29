/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mavenproject3{
    private static double sayi1 = 0;
    private static double sayi2 = 0;
    private static String operator = "";
    private static JTextField ekran;

    public static double toplama (double a, double b) {
        return a + b;
    }public static double çıkarma (double a,double b){
        return a-b;
    }public static double çarpma (double a, double b){
        return a*b;
    }public static double bölme (double a,double b){
        if(b==0){
            return Double.NaN;
        }
        return a/b;
    }public static double karekökAlma (double a){
        return Math.sqrt(a);
    }public static double üsAlma (double a,double b){
        if(a<0){
            return Double.NaN;
        }
                return Math.pow(a,b);
    }

    public static void main(String[] args) {

        //Ekran oluşturma yeri
        JFrame arayüz = new JFrame("Hesap Makinesi");
        arayüz.setSize(400, 550);
        arayüz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        arayüz.setLayout(new FlowLayout());

        //Panel oluşturma yeri
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,4,4,4));
        arayüz.add(panel, BorderLayout.CENTER);
        //DÜĞME BELİRLEME YERİ;
        String[] düğmeMetinleri = {
                "√", "^", "AC", "C",
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                ",", "0", "=", "÷"
        };
        // Düğme boşluk ayarlama yeri
        GridBagConstraints boyutlandırma = new GridBagConstraints();
        boyutlandırma.fill = GridBagConstraints.BOTH;
        boyutlandırma.weightx = 2;
        boyutlandırma.weighty = 3;
        boyutlandırma.insets = new Insets(5,5,5,5);;

    // Düğmelere atama yeri
        for(String metin : düğmeMetinleri){
            JButton dugme = new JButton(metin);
            dugme.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String komut = e.getActionCommand();
                    islemYap(komut);
                }

            });
            panel.add(dugme);
        }

        arayüz.setVisible(true);

            }
    private static void islemYap(String komut){
        switch(komut){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ",":
              ekran.setText(komut);
              break;
            case "+":
            case "-":
            case "*":
            case "÷":
            case "^":
            case "√":
                if (!ekran.getText().isEmpty()){
                    sayi1 = Double.parseDouble(ekran.getText());
                    operator = komut;
                    ekran.setText("");
            }
            break;

        }

        }
    }


