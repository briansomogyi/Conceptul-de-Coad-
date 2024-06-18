public class CoadaClient {
    public static void main(String[] args) {
        Coada coada = new Coada(18);
        Maestro maestro = new Maestro("Brian", "1234");
        MasterCard masterCard = new MasterCard("Brian", "5678", "901");
        Visa visa = new Visa("Brian", "012345678913457895789", "789");
        CardBancar[] myCards = new CardBancar[] { maestro, masterCard, visa };
        for (CardBancar cardBancar : myCards) {
            try {
                coada.addLast(cardBancar);
            } catch (NuMaiExistaLoc e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        coada.list();
    }
}
