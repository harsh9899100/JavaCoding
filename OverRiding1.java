class Cars{
    public void priceofcar(){
        System.out.println("It is Generally depends On Cars Type");
    }
}

class Royalcars extends Cars{
    @Override
    public void priceofcar() {
        System.out.println("This is Royal cars Catagories");
    }
}

public class OverRiding1 {
    public static void main(String[] args) {
        Royalcars rc=new Royalcars();
        rc.priceofcar();

        Cars rc1=new Cars();
        rc1.priceofcar();

        Cars rcc1=new Royalcars();
        rcc1.priceofcar();
        
    }
}
