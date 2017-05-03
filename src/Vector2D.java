
public class Vector2D {
    double x;
    double y;

    private double DlugoscWektora;
        public Vector2D() {
            x = 0;
            y = 0;
        }
        public Vector2D(double mojex, double mojey) {
            x = mojex;
            y = mojey;
        }
        public String Info() {
            return "Wektor\nx = "+x+" y = "+y;
        }
        public Vector2D SumaWektorowa(Vector2D wekt) {
            Vector2D SumaWektorow = new Vector2D(wekt.x+x,wekt.y+y);
            return SumaWektorow;

        }
        public Vector2D RoznicaWektorowa(Vector2D wekt) {
            Vector2D RoznicaWektorow = new Vector2D(x-wekt.x,y-wekt.y);
            return RoznicaWektorow;
        }
        public Vector2D MnozenieWektora( int mnoznik) {
            Vector2D PomnozonyWektor = new Vector2D(mnoznik*x, mnoznik*y);
            return PomnozonyWektor;
        }
        public double DlugoscWektora() {
            DlugoscWektora = (int) Math.sqrt(x*x+y*y);
            return DlugoscWektora;
        }
        public Vector2D NormalizacjaWektora() {
            double Xznormalizowane = x/(Math.sqrt(x*x+y*y));
            double Yznormalizowane = y/(Math.sqrt(x*x+y*y));
            Vector2D ZnormalizowanyWektor = new Vector2D(Xznormalizowane,Yznormalizowane);
            return ZnormalizowanyWektor;
        }
}
