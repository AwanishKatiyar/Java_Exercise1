public class Ques2 {
    public static void main(String[] args) {
        String input="This is ques 2 of java exercise java exercise of bootcamp";
        String[] words=input.split(" ");
        int count=1;
        for(int i=0;i<words.length;i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {

                if (words[i].equals(words[j]))
                {
                    count = count + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + count);
            count = 1;
        }
    }
}
