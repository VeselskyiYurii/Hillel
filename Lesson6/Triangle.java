package Lesson6;

public class Triangle {

    public  Integer firstSide;
    public  Integer secondSide;
    public  Integer thirdSide;


    public Triangle (Integer firstSide, Integer secondSide, Integer thirdSide) {

        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    public Integer getFirstSide(){
        return firstSide;
    }

    public Integer getSecondSide() {
        return secondSide;
    }

    public Integer getThirdSide() {
        return thirdSide;
    }


}
