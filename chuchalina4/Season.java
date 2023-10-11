package chuchalina4;
public enum Season {
    WINTER (-40,"Зима"),
    SPRING (-10,"Весна"),
    SUMMER(+10,"Лето"),
    AUTUMN(-10,"Осень");
    private int minTemp;
    private String name ;

    Season(int minTemp, String name) {
        this.minTemp = minTemp;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я люблю " + name+ "это очень"+ getDescription();

    }
    public String getDescription (){
        if (name =="Зима") {
            return "Холодное время года";
        }
        else if (name == "Лето") {
            return "Теплое время года";
        }
        else if (name=="Осень") {
            return "Жёлтые листья";
        }
        else if (name=="Весна") {
            return "Слякоть";
        }
        return null;
    }


}

