package assigment_pro;

import java.util.Scanner;
import java.util.*;

public class Assigment_PRO {
    protected static ArrayList<DomesticTours> listDomeTour = new ArrayList<DomesticTours>();
    protected static ArrayList<InternationalTours> listInterTour = new ArrayList<InternationalTours>();
       
    protected static void Menu() {
        System.out.println("========= MENU =========");
        System.out.println("1. Add a new Tour");
        System.out.println("2. List all domestic tours in the system");
        System.out.println("3. Compute the average tour charge of all international tours");
        System.out.println("4. Search tour by minimum tour charge");
        System.out.println("5. Remove the tour having given code");
        System.out.println("6. Sort all tours of list by multiple levels in descending order of tour’s price and then in ascending order of tour’s title");
        System.out.println("7. Update tour information");
        System.out.println("8. Save/ Load tours to/ from file");
    }
    
    public static void main(String[] args) {
       Menu();
       
       Scanner inputScanner = new Scanner(System.in);
       String chooseLine;
       
       while(true) {
           System.out.print("Let's entry your choosen: ");
           chooseLine = inputScanner.nextLine();
           
           char choose = chooseLine.charAt(0);
           if (choose == '1') AddElement();
           if (choose == '2') PrintDomeList();
           if (choose == '3') Compute();
           if (choose == '4') MinimumTourCharge();
           if (choose == '5') GiveCode();
           if (choose == '6') Sort();
           if (choose == '7') Update();
           if (choose == '8') SaveOrLoad();
       }
    }
    
    protected static void SaveOrLoad() {
        System.out.print("Save or Load (0 or 1): ");
        Scanner input = new Scanner(System.in);
        int SL = input.nextInt();
        
        if (SL == 0) Save();
        if (SL == 1) Load();
    }
    
    protected static void Update() {
        System.out.print("Let's entry code tour to update: ");
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        
        for (InternationalTours tour : listInterTour)
               if (code.equals(tour.getTourCode())) {
                   tour.RequestInputTour();
                   System.out.println("Update succecfull.");
                   return;
            }
        for (DomesticTours tour : listDomeTour)
               if (code.equals(tour.getTourCode())) {
                   tour.RequestInputTour();
                   System.out.println("Update succecfull.");
                   return;
            }
    }
    
    protected static void GiveCode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Let's entry code: ");
        String code = input.nextLine();
        FindAndRemove(code);
    }
    
    protected static void Sort() {
        for (int i = 0; i < listDomeTour.size(); i++)
            for (int j = i + 1; j < listDomeTour.size(); j++)
                if (CheckDome(listDomeTour.get(i), listDomeTour.get(j))) {
                    DomesticTours key = listDomeTour.get(i);
                    listDomeTour.set(i, listDomeTour.get(j));
                    listDomeTour.set(j, key);
                }
        for (int i = 0; i < listInterTour.size(); i++)
            for (int j = i + 1; j < listInterTour.size(); j++)
                if (CheckInter(listInterTour.get(i), listInterTour.get(j))) {
                    InternationalTours key = listInterTour.get(i);
                    listInterTour.set(i, listInterTour.get(j));
                    listInterTour.set(j, key);
                }
    }
    
    protected static boolean CheckDome(DomesticTours tourA, DomesticTours tourB) {
        if (tourA.getPrice() > tourB.getPrice()) return true;
        if (tourA.getPrice() == tourB.getPrice()) 
            if (tourA.getTourTitle().compareTo(tourA.getTourTitle()) < 0)
                return true;
        return false;
    }
    
    protected static boolean CheckInter(InternationalTours tourA, InternationalTours tourB) {
        if (tourA.getPrice() > tourB.getPrice()) return true;
        if (tourA.getPrice() == tourB.getPrice()) 
            if (tourA.getTourTitle().compareTo(tourA.getTourTitle()) < 0)
                return true;
        return false;
    }
    
    protected static void FindAndRemove(String code) {
        for (InternationalTours tour : listInterTour)
            if (code.equals(tour.getTourCode())) {
                listInterTour.remove(tour);
                System.out.println("Remove succecfull.");
                return;
            }
        for (DomesticTours tour : listDomeTour)
            if (code.equals(tour.getTourCode())) {
               listDomeTour.remove(tour);
               System.out.println("Remove succecfull.");
               return;
            }
        System.out.println("Don't find element to remove.");
    }
    
    protected static void MinimumTourCharge() {
        float value = 0x3c3c3c3c;
        for (InternationalTours tour : listInterTour)
            value = Math.min(value, tour.GetTourCharge());
        for (DomesticTours tour : listDomeTour)
            value = Math.min(value, tour.GetTourCharge());
        System.out.println("The Mininum tour charge: " + value);
    }
    
    protected static void Compute() {
        float average = 0;
        for (InternationalTours tour : listInterTour)
            average = average + tour.GetSurcharge();
        average = average / listInterTour.size();
        System.out.println("The average of list: " + average);
    }
    
    protected static void PrintDomeList() {
        for (DomesticTours tour : listDomeTour)
            tour.PrintInfo();
    }
    
    protected static void GetTourInternational() {
        InternationalTours tour = new InternationalTours();
        tour.RequestInputTour();
        tour.getAviationTax();
        tour.getEntryFree();
        listInterTour.add(tour);
    }
    
    protected static void GetTourDomestic() {
        DomesticTours tour = new DomesticTours();
        tour.RequestInputTour();
        tour.getTourGuideTip();
        listDomeTour.add(tour);
    }
    
    protected static void AddElement() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the type of tour? (international or domestic):");
        String type = input.nextLine();
        
        if ("international".equals(type)) GetTourInternational();
        if ("domestic".equals(type)) GetTourDomestic();
    }
    
    protected static void Save() {
        
    }
    
    protected static void Load() {
        
    }
    
}
