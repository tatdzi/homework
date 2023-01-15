package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{
    @Override
    public int[] allElements(int[] num) {
        int[] res = new int[num.length];
        int i = 0;
        do {
            res[i] = num[i];
            i++;
        }while (i<num.length);
        return res;

    }

    @Override
    public int[] eachSecondElements(int[] num) {
        int[] res;
        if (num.length%2 == 0) {
            res = new int[num.length/2];
        }else{
            res = new int[num.length/2+1];
        }
        int i = 0;
        int j =0;
        do {
            res[i] = num[j];
            i++;
            j+=2;
        }while (i<res.length);
        return res;
    }

    @Override
    public int[] elementsInReverseOrder(int[] num) {
        int[] res = new int[num.length];
        int i = 0;
        do {
            res[i] = num[(num.length-1)-i];
            i++;
        }while (i<num.length);
        return res;
    }
}
