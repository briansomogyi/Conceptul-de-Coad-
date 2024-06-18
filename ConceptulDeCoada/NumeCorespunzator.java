public class NumeCorespunzator implements Strategie {
    public String getName() {
        return name;
    }

    private String name;

    @Override
    public boolean conditie(CardBancar cardBancar) {
        String thisName = this.getName();
        String cardName = cardBancar.getName();
        return thisName.equals(cardName);
    }

}
