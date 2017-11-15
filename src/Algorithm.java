import java.util.LinkedList;

public class Algorithm {

    private static LinkedList<Integer> tinkerTailor(int N, int k){
        LinkedList<Integer> initList = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        int targetNumber;
        generateList(N, initList);
        int popIdx = 0;
        while (!initList.isEmpty()) {
            popIdx = ((popIdx + k) - 1) % initList.size();
            targetNumber = initList.get(popIdx);
            result.add(targetNumber);
            initList.remove(popIdx);
        }
        return result;
    }

    private static void generateList(int N, LinkedList<Integer> numberList) {
        for (Integer i =1;i<=N;i++) {
            numberList.add(i);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> toPrint;
        toPrint = tinkerTailor(5000, 3);
        System.out.println(toPrint);
    }
}
