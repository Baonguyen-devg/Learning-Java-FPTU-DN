package assigment_pro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TourCharge {
    protected String tourCode;
    protected String tourTitle;
    protected float price;
    protected String tourTransport;
    protected String dateStart;
    protected String dateEnd;

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public void setTourTitle(String tourTitle) {
        this.tourTitle = tourTitle;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTourTransport(String tourTransport) {
        this.tourTransport = tourTransport;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getTourCode() {
        return tourCode;
    }

    public String getTourTitle() {
        return tourTitle;
    }

    public float getPrice() {
        return price;
    }

    public String getTourTransport() {
        return tourTransport;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }
    
    protected void ChangeInfoTour(String code, String title, float price, String trans,
    String dateS, String dateE) {
        this.tourCode = code;
        this.tourTitle = title;
        this.price = price;
        this.tourTransport = trans;
        this.dateStart = dateS;
        this.dateEnd = dateE;
    }
    
    protected float GetTourCharge() {
        return this.price + this.GetSurcharge();
    }
    
    protected float GetSurcharge(){
        return 0;
    }
    
    protected long NumberDate() {
        LocalDate sDate = LocalDate.parse(this.dateStart);
        LocalDate eDate = LocalDate.parse(this.dateEnd);
        long dayBetween = ChronoUnit.DAYS.between(sDate, eDate);
        return dayBetween;
    }
    
    protected void RequestInputTour() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Let's entry the information of tour.\n");    
        System.out.print("Tour's code (*****): ");
        this.setTourCode(input.nextLine());
        System.out.print("Tour's title (string): ");
        this.setTourTitle(input.nextLine());
        System.out.print("Tour's price: ");
        this.setPrice(input.nextFloat());
        System.out.print("Tour's transport");
        this.setTourTransport(input.nextLine());
        System.out.print("Start Date (day - month - year): ");
        this.setDateStart(input.nextLine());
        System.out.print("End Date (day - month - year): ");
        this.setDateEnd(input.nextLine());
    }
    
    protected void PrintInfo() {
        System.out.println("The information of tour");
        System.out.println(this.getTourCode());
        System.out.println(this.getTourTitle());
        System.out.println(this.getPrice());
        System.out.println(this.getTourTransport());
        System.out.println(this.getDateStart());
        System.out.println(this.getDateEnd());
    }
}
