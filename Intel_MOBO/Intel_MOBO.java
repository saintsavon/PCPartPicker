package Intel_MOBO;

public abstract class Intel_MOBO {
    public enum FormFactor { mATX, ATX };
    FormFactor formFactor = FormFactor.mATX;
    String description = "Unknown formFactor";

    public String getDescription() {
        return description;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public FormFactor getFormFactor() {
        return this.formFactor;
    }

    public abstract double cost();
    
}
