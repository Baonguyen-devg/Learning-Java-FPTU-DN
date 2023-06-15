/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import model.EastAsiaCountries;
import view.Menu;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class CountryManagement extends Menu {

    ArrayList<EastAsiaCountries> countries = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private final Validation val = new Validation();
    boolean check = false;
    String format = "| %12s | %17s | %13s | %10s |\n";

    static String[] menu = {"Input the information of 11 countries in East Asia",
        "Display the information of country you've just input",
        "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending order",
        "Exit"
    };

    public CountryManagement() {
        super("======== MENU ========", menu);

    }

    @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:

                inputInfor();

                break;

            case 2:

                displayInfor();
                break;
            case 3:
                searchInfor();
                break;
            case 4:
                DisplaySort();
                break;

            case 5:
                System.out.println("Exit successfully");
                System.exit(0);

            default:
        }
    }

    // function 
    public void inputInfor() {
        System.out.println("Input the information of 11 countries in East Asia");
        while (countries.size() < 2 || check) {

            String code = val.getID("Enter code of country: ");
            String name = val.getName("Enter name of country: ");
            float totalArea = val.getFloat("Enter total Area");
            String terrain = val.getName("Enter terrain of country: ");
            countries.add(new EastAsiaCountries(terrain, code, name, totalArea));
            check = false;
        }
        check = true;
    }

    public void displayInfor() {
        if (countries.isEmpty()) {
            System.err.println("No country to show");
            return;
        }

        // Print the table headers
        System.out.printf(format, "ID", "Name", "Total Area", "Terrain");
        System.out.println("|--------------|-------------------|--------------|-----------|");
        for (EastAsiaCountries c : countries) {
            System.out.printf(format, c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
        }
    }

    public void searchInfor() {
        if (countries.isEmpty()) {
            System.err.println("No country to search");
            return;
        }
        String name = val.getName("Enter the name you want to search for: ");
        for (EastAsiaCountries c : countries) {
            if (name.equalsIgnoreCase(c.getCountryName())) {
                System.out.printf(format, "ID", "Name", "Total Area", "Terrain");
                System.out.println("|--------------|-------------------|--------------|-----------|");
                System.out.printf(format, c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
            }
        }
    }

    public void DisplaySort() {
        if (countries.isEmpty()) {
            System.err.println("No country to sort, please input country");
            return;
        }
        ArrayList<EastAsiaCountries> result = new ArrayList<>();
        result.addAll(countries);
        result.sort(new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());

            }
        ;

        });
         System.out.printf(format, "ID", "Name", "Total Area", "Terrain");
        System.out.println("|--------------|-------------------|--------------|-----------|");
        for (EastAsiaCountries c : result) {
            System.out.printf(format, c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
        }
    }

}
