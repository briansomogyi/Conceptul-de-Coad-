public abstract class CardBancar {
    private String name;
    private String iban;

    public CardBancar(String name, String iban) {
        this.name = name;
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "CardBancar [name=" + name + ", iban=" + iban + "]";
    }

}
