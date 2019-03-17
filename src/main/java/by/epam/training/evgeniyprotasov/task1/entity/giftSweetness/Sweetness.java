package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

public abstract class Sweetness{

    private String name;
    private int sugarPercentage;
    private int weight;

    public Sweetness(String name,int weight,int sugarPercentage)
    {
        this.name=name;
        this.weight=weight;
        this.sugarPercentage=sugarPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSugarPercentage(int sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }

    public int getSugarPercentage() {
        return sugarPercentage;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "("+ name + " : " + "Weight="+weight + " : " +"SugarPercentage="+sugarPercentage + ") ";
    }


}
