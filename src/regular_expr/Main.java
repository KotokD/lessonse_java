package regular_expr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by katokda on 17.07.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String word =reader.readLine();
        checkWithRegExp(word);
    }

    public static void checkWithRegExp(String word) {
        Pattern p = Pattern.compile("[a-zA-Z]{1}[a-zA-Z\\d\\u002E]+@([a-zA-Z]+\\u002E){1,2}((ru)|(net)|(com)|(org))");
        Pattern pp = Pattern.compile("\\d{9,12}");
        Pattern ppp=Pattern.compile("[a-zA-Z0-9\\u002E]{8,16}");
        Matcher m = p.matcher(word);
        Matcher mm=pp.matcher(word);
        Matcher mmm=ppp.matcher(word);
        if (m.matches()==true)
        {
            System.out.println("Can send letter");
        }
        else if(mm.matches()==true)
        {
            System.out.println("Can call on the phone");
        }
        else if(mmm.matches()==true)
        {
            System.out.println("Can use Skype");
        }
       else    System.out.println("Incorrect input ");
        }
    }
