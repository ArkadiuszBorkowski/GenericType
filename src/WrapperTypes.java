public class WrapperTypes {
    public static void main(String[] args) {
        Integer value = Integer.valueOf(123);
        Double value2 = Double.valueOf(25.5);

        int vvalue = value.intValue();
        double vvalue2 = value2.doubleValue();

        Object ref = Integer.valueOf(123);
        Object[] refs = {"raz", 2, 3.5};

        String nr = "25";
        int valNr = Integer.parseInt(nr);
        Integer valNr2 = Integer.valueOf(nr);


    }
}
