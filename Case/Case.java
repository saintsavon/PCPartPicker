package Case;

public abstract class Case {
    public enum FormFactor { mATX, ATX };
    FormFactor formFactor = FormFactor.mATX;
    String description = "Unknown form factor";

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
