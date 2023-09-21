import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         String[] numbers = {"1, 2, 0", "4, 5", "1, 2, 0" , "11, 12, 10"};

         String temp = "";
        for (int i = 0; i < numbers.length; i++) {
            temp = temp + numbers[i] + " ";
        }
        System.out.println(temp); //

        temp = temp.replaceAll("," , "").trim();

        System.out.println(temp);//

        String[] res = temp.split(" ");


        Integer[] Sorted = new Integer[res.length];

        for (int i = 0; i < res.length; i++) {
            Sorted[i] = Integer.parseInt(res[i]);
        }
        Arrays.sort(Sorted);

        System.out.println(Arrays.toString(Sorted));
    }
}