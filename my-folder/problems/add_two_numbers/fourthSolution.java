import java.util.LinkedList;

public class fourthSolution {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);

        int lengthL1 = l1.size();
        int lengthL2 = l2.size();
        int numberOfArrayL1 = 0;
        int numberOfArrayL2 = 0;
        Object[] arrayL1 = l1.toArray();
        Object[] arrayL2 = l2.toArray();
        int multiplicationL1 = 1;
        int multiplicationL2 = 1;
        int positionL1 = 0;
        int positionL2 = 0;

        for (int i = 0; i < lengthL1; i++){
            arrayL1[i] = l1.get(positionL1);
            numberOfArrayL1 = numberOfArrayL1 + l1.get(positionL1) * multiplicationL1;
            positionL1 = positionL1 + 1;
            multiplicationL1 = multiplicationL1 * 10;
        }
        for (int j = 0; j < lengthL2; j++){
            arrayL2[j] = l2.get(positionL2);
            numberOfArrayL2 = numberOfArrayL2 + l2.get(positionL2) * multiplicationL2;
            multiplicationL2 = multiplicationL2 * 10;
            positionL2 = positionL2 + 1;
        }
        int sum = numberOfArrayL1 + numberOfArrayL2;

        String numberStr = String.valueOf(sum);
        for (char digitChar : numberStr.toCharArray()) {
            l3.add(Character.getNumericValue(digitChar));
        }
        System.out.println(l3);
    }


}
