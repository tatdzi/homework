package home_work_5;

public class ChackTimeOperation {
    private String nameOperation;
    private long timeOperation;


    public ChackTimeOperation(String nameOperation, long timeOperation) {
        this.nameOperation = nameOperation;
        this.timeOperation = timeOperation;

    }

    @Override
    public String toString() {
        return "Тип операции: "+nameOperation+", Время выполнениея операции : "+timeOperation+" мс";
    }
}
