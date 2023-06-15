package assigment_pro;

public class InternationalTours extends TourCharge {
    protected float aviationTax;
    protected float entryFree;
    
    public float getAviationTax() {
        return aviationTax;
    }

    public float getEntryFree() {
        return entryFree;
    }

    public void setAviationTax(float aviationTax) {
        this.aviationTax = aviationTax;
    }

    public void setEntryFree(float entryFree) {
        this.entryFree = entryFree;
    }
    
    @Override
    protected float GetSurcharge() {
        return this.aviationTax + this.entryFree;
    }
}
