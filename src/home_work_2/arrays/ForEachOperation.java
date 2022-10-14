package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{
    @Override
    public int[] allElements(int[] num) {
        int[] res = new int[num.length];
        for (int i:num){
            res[i] = num[i];
        }
        return res;
    }

    @Override
    public int[] eachSecondElements(int[] num) {
        return new int[0];
    }

    @Override
    public int[] elementsInReverseOrder(int[] num) {
        return new int[0];
    }
}
