public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = id;
    }

    public String getCalcModel() {
        //implement code here
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber = idNumber + 1;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double diff = num1 - num2;
        return diff;
    }

    public double multiply(double num1, double num2) {
        double product = num1*num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        int divide = num1/num2;
        return divide;
    }

    public int remainder(int num1, int num2) {
        int mod = num1%num2;
        return mod;
    }

    public String divisionResult(int num1, int num2) {
        int quo = quotient(num1, num2);
        int rem = remainder(num1, num2);
        return quo + " R " + rem;
    }

    public String coordinatePair(int x, int y) {
        String coord = "(" + x + ", " + y + ")";
        return coord;
    }

    public int average(int num1, int num2) {
        int ave = (int)(((double)num1 + num2)/2 + 0.5);
        return ave;
    }

    public String info() {
        calcModel = getCalcModel();
        idNumber = getIdNumber();
        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
