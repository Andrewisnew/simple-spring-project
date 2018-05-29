package horse_race.configuration.xml.services;

import horse_race.configuration.xml.objects.Horse;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EmulationService {
    private RaceService raceService;

    public EmulationService(RaceService raceService) {
        this.raceService = raceService;
    }

    public RaceService getRaceService() {
        return raceService;
    }

    public void setRaceService(RaceService raceService) {
        this.raceService = raceService;
    }

    public void start() throws InterruptedException {
        List<Horse> horses = raceService.getRace().getHorses();
        System.out.println("\nHorses in the race: \n");
        showHorses(horses);
        Horse chosenHorse = makeABet();
        countdown();
        Horse winnerHorse = race(horses);
        System.out.println("Winner horse : \n" + winnerHorse);
        if(winnerHorse.equals(chosenHorse)){
            System.out.println("You win!");
        } else{
            System.out.println("You lose!");
        }



    }

    private void showHorses(List<Horse> horses) {
        for (int i = 0; i < horses.size(); i++) {
            System.out.println(i + 1 + " : " + horses.get(i));
        }
    }

    private void countdown() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println("\n" + i + "\n");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("GO!!!\n");
    }

    private Horse race(List<Horse> horses) throws InterruptedException {
        for (int j = 1; j <= 5; j++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n" + j + " barier:");
            Collections.shuffle(horses);
            showHorses(horses);
        }
        return horses.get(0);
    }

    private Horse makeABet() {
        System.out.println("Make your bet:\n" +
                "Choose horse by: \n" +
                "1 - name;\n" +
                "2 - breed;\n" +
                "3 - rider’s name;\n" +
                "Your choice: ");

        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                if (choice < 1 || choice > 3) {
                    System.out.println("Enter number 1-3:");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number 1-3:");
            }
        }
        System.out.println("Choose your horse:");
        Horse chosenHorse = null;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String horseDescription = scanner.next();
            switch (choice) {
                case 1:
                    chosenHorse = raceService.findByName(horseDescription);
                    break;
                case 2:
                    chosenHorse = raceService.findByBreed(horseDescription);
                    break;
                case 3:
                    chosenHorse = raceService.findByRidersName(horseDescription);
                    break;
            }
            if (chosenHorse != null) {
                break;
            } else {
                System.out.println("Horse not found! Try again: ");
            }
        }
        return chosenHorse;
    }
}
