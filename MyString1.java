package lab5;

public class MyString1 {

    private char[] chars; 
    

    public MyString1(char[] chars) //public MyString1(char[] chars);
    { 

        this.chars = new char[chars.length];

        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];
    }

    public MyString1(String string) 
    {
        this(string.toCharArray());
    }

    public char charAt(int index)  // public char charAt(int index);
    { 
        return chars[index];
    }

    public int length()  // public int length();
    { 
        return chars.length;
    }

    public MyString1 substring(int begin, int end) //public MyString1 substring(int begin, int end); 
    { 
        char[] s = new char[end - begin];
        for (int i = begin; i < end; i++) {
            s[i - begin ] = chars[i];
     }
        return new MyString1(s);
    }

    public MyString1 toLowerCase() //public MyString1 toLowerCase();
    { 
        char[] lowerCase = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerCase[i] = (char)(chars[i] + 32);
            } else {
                lowerCase[i] = chars[i];
            }
        }
        return new MyString1(lowerCase);
    }

    public boolean equals(MyString1 s)  //public boolean equals(MyString1 s);
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != chars[i]) return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) //public static MyString1 valueOf(int i);
    { 
        int length = getCount(i);
        char[] number = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new MyString1(number);
    }

    private static int getCount(long i) //additional function to get the length of the string to use it in valueOf()
    { 
        int length = 0;
        while (i > 0) {
            i /= 10;
            length++;
        }
         return length;
    }

	
}