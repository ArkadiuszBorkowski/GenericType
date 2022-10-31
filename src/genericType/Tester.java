package genericType;

class Tester {
    public static void main(String[] args) {
//        IntContainter intContainter = new IntContainter();
//        intContainter.setArray(new int[] {1,2,3,4,5});
//        intContainter.printArray();
//        int[] ints = intContainter.getArray();
//        System.out.println(ints[0] + ints[1]);
//
//        StringContainter stringContainter = new StringContainter();
//        stringContainter.setArray(new String[]{"Ania", "Kasia", "Basia"});
//        stringContainter.printArray();

        Container<Integer> container = new Container<>();
        container.setArray(new Integer[]{1,2,3,4,5});
        container.printArray();
        Integer[] array = container.getArray();
        System.out.println(array[0]+ array[1]+ array[2]);

        Container<String> strContainer = new Container<>();
        strContainer.setArray(new String[]{"a", "b", "c"});
        String[] strArray = strContainer.getArray();
        for (String s : strArray) {
            System.out.println(s.toUpperCase());
        }

        print5Times(5);
        print5Times("Krzysio");

        //System.out.println(array[0] + array[1]);  //nie da się dodawać obiektów w taki sposób

    }

    private static <T> void print5Times(T arg) {
        for (int j = 0; j < 5; j++) {
            System.out.println(arg);
        }
    }
}
