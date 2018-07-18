package sg.edu.rp.c346.basicmathformula;

public class MathItem {
    private String title;
    private String formula;
    private String type;

    public MathItem(String title, String formula, String type) {
        this.title = title;
        this.formula = formula;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
