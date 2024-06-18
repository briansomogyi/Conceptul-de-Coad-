public class ContineCifra implements Strategie {
    public ContineCifra() {

    }

    @Override
    public boolean conditie(CardBancar cardBancar) {
        String iban = cardBancar.getIban();
        int nrCifra = 0;
        for (int i = 0; i < iban.length(); i++) {
            char c = iban.charAt(i);
            if (c == '5') {
                nrCifra++;
            }
        }
        return nrCifra == 3;
    }

}
