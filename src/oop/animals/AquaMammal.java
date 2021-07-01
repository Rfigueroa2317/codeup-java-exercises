package oop.animals;

public class AquaMammal extends MarineAnimal {

    private int maxTimeSubmerged;

    public AquaMammal(boolean canSwim, int length, int finCount,
                      boolean isSaltwater, String name, boolean hasScales) {
        super(canSwim, length, finCount, isSaltwater, name);

    }

    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltwater;
    private String name;


    public AquaMammal(String blue_whale) {
        super();
    }

    public int getMaxTimeSubmerged() {
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged) {
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
}
