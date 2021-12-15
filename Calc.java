import Methods.AboutUser;
import Methods.CalcMan;
import Methods.CalcWoman;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AboutUser aboutUser = new AboutUser();
        CalcMan calcMan = new CalcMan();
        CalcWoman calcWoman = new CalcWoman();

        System.out.println("Hej");
        System.out.println(" ");
        System.out.println("teraz obliczymy Twoje BMI, oraz skład ciała i zapotrzebowanie kaloryczne");
        System.out.println(" ");
        System.out.println("Podaj proszę swoje imię: ");
        aboutUser.setName(scanner.nextLine());
        System.out.println(" ");
        System.out.println("Witaj " + aboutUser.getName());
        System.out.println(" ");
        System.out.println(aboutUser.getName() + ", teraz podaj swoją płeć:");
        System.out.println("1. Mężczyzna");
        System.out.println("2. Kobieta");
        aboutUser.setSex(scanner.nextInt());
        System.out.println(aboutUser.getName() + ", podaj proszę swoją wagę w kilogramach: ");
        aboutUser.setWeight(scanner.nextDouble());
        System.out.println(aboutUser.getName() + ", podaj proszę swój wzrost w centymetrach: ");
        aboutUser.setHeight(scanner.nextDouble());
        System.out.println(aboutUser.getName() + ", teraz proszę podaj swój wiek");
        aboutUser.setAge(scanner.nextInt());

        System.out.println("Jaki jest stopień Twojej aktywności: ");
        System.out.println("1. praca siedząca, niska aktywność");
        System.out.println("2. mała aktywność (praca siedząca i 1-2 treningi w tygodniu)");
        System.out.println("3. średnia aktywność (praca siedząca, treningi 3-4 razy w tygodniu)");
        System.out.println("4. wysoka aktywność (praca fizyczna i 3-4 treningi w tygodniu)");
        System.out.println("5. bardzo wysoka aktywność (zawodowi sportowcy, osoby trenujące codziennie)");
        System.out.println(" ");
        aboutUser.setActivity(scanner.nextInt());

        if (aboutUser.getSex() == 1) {
            calcMan.BMI(aboutUser.getWeight(), aboutUser.getHeight());
            calcMan.correctBodyWeight(aboutUser.getWeight(), aboutUser.getHeight());
            calcMan.leanBodyMass(aboutUser.getWeight(), aboutUser.getHeight());
            calcMan.BMRandPPM(aboutUser.getWeight(), aboutUser.getHeight(), aboutUser.getAge(), aboutUser.getActivity());
        } else if (aboutUser.getSex() == 2){
            calcWoman.BMI(aboutUser.getWeight(), aboutUser.getHeight());
            calcWoman.correctBodyWeight(aboutUser.getWeight(), aboutUser.getHeight());
            calcWoman.leanBodyMass(aboutUser.getWeight(), aboutUser.getHeight());
            calcWoman.BMRandPPM(aboutUser.getWeight(), aboutUser.getHeight(), aboutUser.getAge(), aboutUser.getActivity());
        }
    }
}
