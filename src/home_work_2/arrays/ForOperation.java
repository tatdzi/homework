package home_work_2.arrays;

public class ForOperation implements IArraysOperation{

    @Override
    public int[] allElements(int[] num) {
        int[] res = new int[num.length];
        for (int i = 0 ; i < num.length; i++){
            res[i] = num[i];
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
        int j,i;
        for (i = 0 , j = 0 ; i < res.length; i++,j+=2){
            res[i] = num[j];
        }
        return res;
    }

    @Override
    public int[] elementsInReverseOrder(int[] num) {
        int[] res = new int[num.length];
        for (int i = 0 ; i < num.length; i++){
            res[i] = num[(num.length-1)-i];
        }
        return res;
    }
}
