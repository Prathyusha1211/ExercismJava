public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualTime){
        return expectedMinutesInOven()-actualTime;
    }

    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    public int totalTimeInMinutes(int layers,int actualTime){
        return preparationTimeInMinutes(layers)+actualTime;
    }
}
