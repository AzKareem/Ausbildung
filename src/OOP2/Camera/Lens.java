package OOP2.Camera;

public class Lens {


    int minBrennweite;
    int maxBrennweite;
    static int lensCounter;

    public Lens(int minBrennweite, int maxBrennweite) {
        if (minBrennweite < maxBrennweite) {
            this.minBrennweite = minBrennweite;
            this.maxBrennweite = maxBrennweite;
            lensCounter++;

        } else {
            System.out.println("Die maximale Brennweite muss immer größer sein  als die angegebene minimale Brennweite.");
        }
    }

    public void setMinBrennweite(int minBrennweite) {
        if (minBrennweite < maxBrennweite){
            this.minBrennweite = minBrennweite;
        }else {
            System.out.println("Die minBrennweite muss kleiner sein als die maxBrennweite: " + maxBrennweite);
        }

    }

    public void setMaxBrennweite(int maxBrennweite) {
        if (maxBrennweite > minBrennweite){
            this.maxBrennweite = maxBrennweite;
        }else {
            System.out.println("Die maxBrennweite muss größer sein als die minBrennweite: " + minBrennweite);
        }

    }

    public int getMinBrennweite() {
        System.out.println(minBrennweite);
        return minBrennweite;
    }

    public int getMaxBrennweite() {
        System.out.println(maxBrennweite);
        return maxBrennweite;
    }


    public String toString(){
        return "Lens minBrennweite: "+ minBrennweite + ", maxBrennweite: "+ maxBrennweite;
    }

}
