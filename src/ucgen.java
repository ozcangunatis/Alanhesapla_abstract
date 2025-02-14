public class ucgen extends sekil {
    private int a;
    private int b;
    private int c;

    public ucgen(String isim, int c, int b, int a) {
        super(isim);
        this.c = c;
        this.b = b;
        this.a = a;
    }

    @Override
   public void alanHesapla() {
double u = (a + b + c) / 2.0;
double alan = Math.sqrt( u * (u-a) * (u-b) * (u-c));
        System.out.println(getIsim() + "ın alanı" + alan);
    }
}
