package com.bxit.lesson10;

public class Task1 {
    public static void main(String[] args) {

    }
}

class Fifth{
    public String[] splitterOwn(String str, int n){
        int len = (str.length() / (double) n) % 1 == 0 ? str.length() / n : (int) Math.ceil(str.length() / (double) n);
        String[] strings = new String[len];
        int counter = 0;
        for (int i = 0; i < str.length(); i += n) {
            int end = str.length() > i + n ? i + n : str.length();
            strings[counter++] = str.substring(i, end);
        }
        return strings;
    }

}
class Fourth{
    public Integer countOwn(String str){
        Integer counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == ',') {
                counter++;
            }
        }
        return counter;
    }

    public Integer count(String str){
        String result = str
                . replace("?", "")
                . replace("!", "")
                . replace(".", "")
                . replace(",", "");
        return str.length() - result.length();
    }
}
class ThirdTask {
    public String correctFioOwn(String name, String surname, String patronymic){
        String inits = "";
        inits += surname.toUpperCase().charAt(0) + ".";
        inits += name.toUpperCase().charAt(0) + ".";
        inits += patronymic.toUpperCase().charAt(0) + ".";

        return inits;
    }
    public String correctFio(String name, String surname, String patronymic){
        String inits = "";
        inits += Character.toUpperCase(surname.charAt(0));
        inits += Character.toUpperCase(name.charAt(0));
        inits += Character.toUpperCase(patronymic.charAt(0));

        return String.format("%s.%s.%s",inits.charAt(0),inits.charAt(1),inits.charAt(2));
    }
}

class SecondTask{
    public boolean startsAndEnds(String sentence, String word){
        return sentence.startsWith(word) && sentence.endsWith(word);
    }
}

class FirstTask {
    public String swapperMine(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        Integer idx;

        for (int i = 0; i < stringBuilder.lastIndexOf("("); i++) {
            idx = stringBuilder.indexOf("(");
            stringBuilder.setCharAt(idx, ')');
        }
        return stringBuilder.toString();
    }

    public String swapper(String str){
        return str.replace(":(", ":)");
    }
}