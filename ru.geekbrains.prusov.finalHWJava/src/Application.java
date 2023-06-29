import java.io.IOException;

public class Application {
    public static void  start() throws IOException {
        ToyShop toyShop = new ToyShop();
        toyShop.addToy(new Toy("Doll", 60));
        toyShop.addToy(new Toy("Car", 20));
        toyShop.addToy(new Toy("Robot", 20));
        toyShop.addToy(new Toy("Plane", 50));

        Lottery lottery = new LotteryToy(toyShop);
        TXTFileRepository fileRepository = new TXTFileRepository("Lottery.txt");
        int size = lottery.fillLotteryToy().size();
        for(int i = 0; i <size; i++){
            fileRepository.saveFile(lottery.getLotteryToy().toString());
        }
    }
}
