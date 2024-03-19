/*
 * Created on 2024-03-18
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

// NO NEED TO TOUCH THIS FILE 
public class Train {
    private final String[] trainHead = { "  .o O___ ", " ][___|O|_", "|        |", "<________|", "//O-O-O-O " };
    private LinkedTrain trainCars = new LinkedTrain();

    public LinkedTrain getTrainCars() {
        return trainCars;
    }

    public void addTrainCar(String cargo) {
        trainCars.add(cargo);
    }

    public void printTrain() {
        System.out.println();
        for (int i = 0; i < trainCars.size(); i++) {
            System.out.print(trainHead[i]);
            for (int j = 0; j < trainCars.size(); j++) {
                if (trainCars.get(j) != null) {
                    System.out.print(trainCars.get(j).getTrainCarString()[i]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
