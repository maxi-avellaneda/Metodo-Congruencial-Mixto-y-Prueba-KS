

package metodo.congruencial.mixto;


public class KS implements Comparable<KS>{
    Double Ui,Fn,FnUi,mod,i;

    public KS(Double Ui, Double i, Double Fn, Double FnUi, Double mod) {
        this.Ui = Ui;
        this.Fn = Fn;
        this.FnUi = FnUi;
        this.mod = mod;
        this.i = i;
    }

    public Double getUi() {
        return Ui;
    }

    public void setUi(Double Ui) {
        this.Ui = Ui;
    }

    public Double getFn() {
        return Fn;
    }

    public void setFn(Double Fn) {
        this.Fn = Fn;
    }

    public Double getFnUi() {
        return FnUi;
    }

    public void setFnUi(Double FnUi) {
        this.FnUi = FnUi;
    }

    public Double getMod() {
        return mod;
    }

    public void setMod(Double mod) {
        this.mod = mod;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }



    @Override
    public int compareTo(KS o) {
        return Ui.compareTo(o.getUi());
    }
    
    
}
