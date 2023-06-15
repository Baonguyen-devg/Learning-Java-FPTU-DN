package assigment_pro;

public class DomesticTours extends TourCharge {
    protected float tourGuideTip;
    
    public void setTourGuideTip(float tourGuideTip) {
        this.tourGuideTip = tourGuideTip;
    }

    public float getTourGuideTip() {
        return tourGuideTip;
    }
    
    @Override
    protected float GetSurcharge() {
        return this.tourGuideTip * this.NumberDate();
    }
}
