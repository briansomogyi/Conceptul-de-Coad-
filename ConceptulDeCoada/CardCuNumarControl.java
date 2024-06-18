public abstract class CardCuNumarControl extends CardBancar {
    private String nrCtrl;

    public CardCuNumarControl(String name, String iban, String nrCtrl) {
        super(name, iban);
        this.nrCtrl = nrCtrl;
    }

    public String getNrCtrl() {
        return nrCtrl;
    }

    @Override
    public String toString() {
        return "CardCuNumarControl [nrCtrl=" + nrCtrl + "]";
    }

}
