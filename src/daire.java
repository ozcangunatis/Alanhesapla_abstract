public class daire extends sekil {
    private int yaricap;

    public daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
   public void alanHesapla() {
        System.out.println(getIsim() + " alanı " +(Math.PI * yaricap * yaricap));

    }
}
