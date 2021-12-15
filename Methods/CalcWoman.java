package Methods;

public class CalcWoman {
    public void BMI(double weight, double high) {
        double wynik = weight / ((high / 100) * (high / 100));
        System.out.println("Twoje BMI wynosi: " + String.format("%.2f", wynik));
        if (wynik < 16.0) {
            System.out.println("Jesteś wygłodzony");
        } else if (wynik > 16 && wynik < 16.9) {
            System.out.println("Jesteś wychudzony");
        } else if (wynik > 17 && wynik < 18.5) {
            System.out.println("Masz niedowagę");
        } else if (wynik > 18.5 && wynik < 24.9) {
            System.out.println("Twoja waga jest prawidłowa");
        } else if (wynik > 25 && wynik < 29.9) {
            System.out.println("Masz nadwagę");
        } else if (wynik > 30 && wynik < 34.9) {
            System.out.println("Masz otyłość I stopnia");
        } else if (wynik > 35 && wynik < 39.9) {
            System.out.println("Masz otyłość II stopnia");
        } else {
            System.out.println("Masz otyłość III stopnia");
        }
    }

    public void correctBodyWeight(double weight, double high) {
        double wynik = weight / ((high / 100) * (high / 100));
        if (wynik > 25) {
            double zmienna1 = ((high / 100) * (high / 100)) * 24;
            double zmienna2 = weight - zmienna1;
            System.out.println("Twoja prawidłowa masa ciała wynosi: " + String.format("%.2f", zmienna1));
            System.out.println("Aby osiągnąć cel musisz schudnąć: " + String.format("%.2f", zmienna2));
        } else if (wynik < 18.4) {
            double zmienna1 = ((high / 100) * (high / 100)) * 24;
            double zmienna2 = zmienna1 - weight;
            System.out.println("Twoja prawidłowa masa ciała wynosi: " + String.format("%.2f", zmienna1));
            System.out.println("Aby osiągnąć cel musisz przybrać na wadze: " + String.format("%.2f", zmienna2));
        } else {
            System.out.println("");
        }
    }

    public void leanBodyMass(double weight, double high) {
        double wynik = weight / ((high / 100) * (high / 100));
        if (wynik > 16 && wynik < 24.9) {
            double lbm = 0.384 * weight + 0.129 * high;
            double water = 0.73 * lbm;
            double fat = weight - lbm;
            System.out.println("Skład Twojego ciała: ");
            System.out.println(" ");
            System.out.println("Twój LBM - beztłuszczowa masa ciała wynosi: " + String.format("%.2f", lbm) + "kg");
            System.out.println(" ");
            System.out.println("Ilość tłuszczu w Twoim ciele : " + String.format("%.2f", fat) + "kg");
            System.out.println(" ");
            System.out.println("Ilość wody w organiźmie : " + String.format("%.2f", water) + "kg");
        } else if (wynik > 25) {
            double lbm = 0.240 * weight + 0.177 * high;
            double water = 0.73 * lbm;
            double fat = 0.760 * weight - 0.177 * high;
            System.out.println("Skład Twojego ciała: ");
            System.out.println(" ");
            System.out.println("Twój LBM - beztłuszczowa masa ciała wynosi: " + String.format("%.2f", lbm) + "kg");
            System.out.println(" ");
            System.out.println("Ilość tłuszczu w Twoim ciele : " + String.format("%.2f", fat) + "kg");
            System.out.println(" ");
            System.out.println("Ilość wody w organiźmie : " + String.format("%.2f", water) + "kg");
        }
        else {
            System.out.println("Podaj poprawne wartości, nie mogę policzyć LBM");
        }
    }

    public void BMRandPPM(double weight, double high, double age, int activity) {
        double bmr = 9.99 * weight + 6.25 * high - 4.92 * age + 5;
        System.out.println(" ");
        System.out.println("Twoje BMR - podstawowa przemiana materii wynosi: " + String.format("%.2f", bmr));
        System.out.println(" ");
        System.out.println("Twoje PPM - dzienne zapotrzebowanie kaloryczne wynosi:" + String.format("%.2f", bmr * activity));
    }
}
