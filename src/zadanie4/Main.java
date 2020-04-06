package zadanie4;

public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt();
        p.Setx(10);
        p.Sety(20);
        System.out.println("Punkt : " + p.toString());

        Punkt pn = new Punkt();
        pn.Setx(4);
        pn.Sety(20);
        System.out.println("Punkt : " + pn.toString());

        Linia l = new Linia(p, pn, p, pn);
        System.out.println("Linia : " + l.toString());

    }
}

class Punkt {
    int x, y;

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public void Setx(int x) {
        this.x = x;
    }

    public void Sety(int y) {
        this.y = y;
    }

    public int Getx() {
        return this.x;
    }

    public int Gety() {
        return this.y;
    }
}

class Linia {
    Punkt poczatek, koniec;

    public String toString() {
        return poczatek.toString() + koniec.toString();
    }


    public Linia(Punkt p, Punkt pn, Punkt poczatek, Punkt koniec) {
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public Linia(int x1, int y1, int x2, int y2) {
        this.poczatek.Setx(x1);
        this.poczatek.Sety(y1);
        this.koniec.Setx(x2);
        this.koniec.Sety(y2);
    }
}


