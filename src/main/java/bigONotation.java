public class bigONotation {

    // O(n)
    public void foo(int[] array) {
        for(int i =0; i < array.length; i++) {
            //..
        }

        for (int i = 0; i < array.length; i++) {
            //..
        }
    }

    // O(n * m)
    public void bar(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {
                //..
            }
        }
        //..
    }

    // O(n*m) or O(n^2)
    public void baz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //..
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    // launch
                }
            }
        }
    }

    // O(n*m) or O(n^2)
    public void beep(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //..
            for (int j = 0; j < array.length; j++) {
                //..
                for (int k = 0; k < 9999999; j++) {
                    // jump
                }
            }
        }
    }
}