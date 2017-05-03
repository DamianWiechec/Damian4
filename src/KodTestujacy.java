
public class KodTestujacy {
    public static void main(String[] args){

        Vector2D wektor1 = new Vector2D(-3,6);
        Vector2D wektor2 = new Vector2D(5,-2);

        System.out.println("1"+wektor1.Info()+"\n");
        System.out.println("2"+wektor2.Info()+"\n");

        System.out.println("Suma wektorowa:\nx = "+wektor1.SumaWektorowa(wektor2).x+" y = "+wektor1.SumaWektorowa(wektor2).y+"\n");
            double Xzsumy = wektor1.SumaWektorowa(wektor2).x;
            double Yzsumy = wektor1.SumaWektorowa(wektor2).y;

        System.out.println("Różnica wektorowa:\nx = "+wektor1.RoznicaWektorowa(wektor2).x+" y = "+wektor1.RoznicaWektorowa(wektor2).y+"\n");
            double Xzroznicy = wektor1.RoznicaWektorowa(wektor2).x;
            double Yzroznicy = wektor1.RoznicaWektorowa(wektor2).y;

        System.out.println("Długość wektora1: "+wektor1.DlugoscWektora()+"\n");
            double DlugoscWektora1 = wektor1.DlugoscWektora();

        System.out.println("Długość wektora2: "+wektor2.DlugoscWektora()+"\n");
            double DlugoscWektora2 = wektor2.DlugoscWektora();

        System.out.println("Wektor1 Znormalizowany:\nx = "+wektor1.NormalizacjaWektora().x+" y = "+wektor1.NormalizacjaWektora().y+"\n");
            double XznormalizowaneWektor1 = wektor1.NormalizacjaWektora().x;
            double YznormalizowaneWektor1 = wektor1.NormalizacjaWektora().y;

        System.out.println("Wektor2 Znormalizowany:\nx = "+wektor2.NormalizacjaWektora().x+" y = "+wektor2.NormalizacjaWektora().y+"\n");
            double XznormalizowaneWektor2 = wektor2.NormalizacjaWektora().x;
            double YznormalizowaneWektor2 = wektor2.NormalizacjaWektora().y;

        System.out.println("Wektor1 przemnożony przez 2:\nx = "+wektor1.MnozenieWektora(2).x+" y = "+wektor1.MnozenieWektora(2).y+"\n");
            double XpomnozonegoWektora1 = wektor1.MnozenieWektora(2).x;
            double YpomnozonegoWektora1 = wektor1.MnozenieWektora(2).y;
    }
}
