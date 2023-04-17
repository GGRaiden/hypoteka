public class Rekurze {
    private int suma;
    private int delka;
    private float uroky;
    private long vypocet;
    private int mesic;
    private int rok;

    public Rekurze(int sum, int doba, float urok){
        suma = sum;
        delka = doba;
        uroky = (urok/100)/12;
        vypocet = vypocet();
        mesic = 0;
        rok = 1;
    }

    public long vypocet(){
        float c1 = suma * uroky;
        double c2 = Math.pow(1+uroky, 12*delka);
        double c3 = c2 - 1;
        double c4 = (c1 * c2) / c3;
        return Math.round(c4);
    }

    public void pocet(){
        long hodnota = suma;
        int hodnotauroku = Math.round(hodnota * uroky);
        long umor = vypocet - hodnotauroku;
        long konecnaHodnota = hodnota - umor;
        int a = 1;
        mesic++;

        suma = (int)konecnaHodnota;

        if (konecnaHodnota < 0){
            konecnaHodnota = 0;
        }

        if (mesic > 12){
            mesic = 1;
            rok++;
        }

        System.out.println("rok: " + rok + " | " + "měsíc: " + mesic + " | " + "počáteční hodnota: " + hodnota + " | " + "úrok: " + hodnotauroku + " | " + "úmor: "+ umor + " | " + "konečná hodnota: " + konecnaHodnota);

        if (a <= 1){
            if (konecnaHodnota > 0){
                pocet();
                a--;
            }
            return;
        }
        else {
            pocet();
            a--;
        }
    }
}
