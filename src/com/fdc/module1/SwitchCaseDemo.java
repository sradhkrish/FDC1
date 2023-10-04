package com.fdc.module1;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner myScn = new Scanner(System.in);
        int month;
        String mthString = null;
        System.out.print("Enter Number:");
        month = myScn.nextInt();

        switch (month) {
            case 1:
                mthString = "Jan";
                break;
            case 2:
                mthString = "Feb";
                break;
            case 3:
                mthString = "Mar";
                break;
            case 4:
                mthString = "Apr";
                break;
            case 5:
                mthString = "May";
                break;
            case 6:
                mthString = "Jun";
                break;
            case 7:
                mthString = "Jul";
                break;
            case 8:
                mthString = "Aug";
                break;
            case 9:
                mthString = "Sep";
                break;
            case 10:
                mthString = "Oct";
                break;
            case 11:
                mthString = "Nov";
                break;
            case 12:
                mthString = "Dec";
                break;
            default:
                mthString = "Invalid Input";
                break;
        }
        System.out.println(mthString);

    }
}
