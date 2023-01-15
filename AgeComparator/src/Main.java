public class Main {
    public static void main(String[] args) {
        int vasyaAge = 5;
        int katyaAge = 6;
        int mishaAge = 9;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }

        if ((vasyaAge <= katyaAge && vasyaAge >= mishaAge) ||
                (vasyaAge >= katyaAge && vasyaAge <= mishaAge)) {
            middle = vasyaAge;
        } else if ((katyaAge <= vasyaAge && katyaAge >= mishaAge) ||
                (katyaAge >= vasyaAge && katyaAge <= mishaAge)) {
            middle = katyaAge;
        } else if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
            middle = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}