package day16arraystugba;

public class Arrays06 {
    public static void main(String[] args) {

        //Print the words ending with "y".
// (Make code case-insensitive)
        String t = "Learn Java, earn money.";
        String withoutPunctuation=t.replaceAll("\\p{Punct}","");

        String arr[]=withoutPunctuation.split(" ");
        for (String w:arr         ) {
            if (w.endsWith("y")|| w.endsWith("Y")){
                System.out.print(w);
            }
        }

    }
}
