import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String[] names = {"Nasser", "Haitham", "Manal", "Hanin"};
        System.out.println(Arrays.toString(names));
        reverseArrayString(names);
    }
    public static void reverseArrayString(String [] arrayString)
    {
        StringBuffer stringBuffer = new StringBuffer();
        List<StringBuffer> stringList=new ArrayList<>();
        int lastIndex=arrayString.length-1;
        int count=0;
//
        for (String names:  arrayString)
        {
            char[] charArray = names.toCharArray();
            int lengthOfName=names.length();
            int lastIndexOfName=lengthOfName-1;
            count++;
            for(int i=lastIndexOfName;i>-1;i--)
                stringBuffer.append(names.charAt(i));
            if(count<=lastIndex)
             stringBuffer.append(",");

        }
        stringList.add(stringBuffer);
        System.out.print(stringList);
    }
}