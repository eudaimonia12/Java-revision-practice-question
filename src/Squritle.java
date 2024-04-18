public class Squritle extends Pokemon implements INoise{
    public Squritle(String name, int level) {
        super(name, level);
        type = new WaterType();
    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(2*level);
        lifePoint+=2;
        this.levelUp();
    }

    @Override
    public void levelUp() {
        if(lifePoint > 6 * level){
            level++;
            System.out.println("Squritle levelled up!");
        }else{
            System.out.println("Not enough experience for Squritle!");
        }

    }

    @Override
    public String makeNoise() {
        return "Squritle squrit";
    }
}
