import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryToy implements Lottery{
    private List<Toy> prizeToys;
    ToyShop toyShop;

    public LotteryToy(ToyShop toyShop) {
        this.toyShop = toyShop;
        this.prizeToys = new ArrayList<>();
    }

    private int countAllToys(){
      int count = 0;
      for(Toy toy: toyShop.getToys()){
          count += toy.getDropFrequency();
      }
      return count;
    }
    private  int quantityToy(Toy toy){
        return toy.getDropFrequency()*countAllToys()/1000;
    }
    public void fillPrizeToys(){
        for(Toy toy: toyShop.getToys()){
            int count = quantityToy(toy);
            while(count != 0) {
                this.prizeToys.add(toy);
                count--;
            }
        }
    }

    public List<Toy> getPrizeToys() {
        return prizeToys;
    }

    @Override
    public Toy getLotteryToy() {
        Collections.shuffle(this.prizeToys);

        return this.prizeToys.remove(0);
    }

    @Override
    public List<Toy> fillLotteryToy() {
        this.fillPrizeToys();
        return this.prizeToys;
    }
}
