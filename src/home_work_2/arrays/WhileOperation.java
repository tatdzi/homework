package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public int[] allElements(int[] num) {
        int[] res = new int[num.length];
        int i = 0;
        while (i<num.length){
            res[i] = num[i];
            i++;
        }
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
        int j = 0;
        while (i<res.length){
            res[i] = num[j];
            i++;
            j+=2;
        }
        return res;
    }

    @Override
    public int[] elementsInReverseOrder(int[] num) {
        int[] res = new int[num.length];
        int i = 0;
        while (i<num.length){
            res[i] = num[(num.length-1)-i];
            i++;
        }
        return res;
    }
}
