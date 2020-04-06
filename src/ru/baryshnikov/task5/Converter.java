package ru.baryshnikov.task5;

public class Converter {
    //private static Contract contr;
    private static Act ac;

    public static Act conv(Contract contr) {
        ac = new Act(contr.getNumber(), contr.getDate(), contr.getProdList());
        return ac;
    }

}
