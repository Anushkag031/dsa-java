class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        boolean special=false;

        for(int i=0; i<password.length(); i++)
        {
            char c=password.charAt(i);

            if(Character.isUpperCase(c)) 
            uppercase=true;
            else if(Character.isLowerCase(c))
            lowercase=true;
            else if(Character.isDigit(c))
            digit=true;
            else if(c=='!' ||c=='@' || c=='#' || c=='$' ||c=='%' ||
            c=='^' || c=='&' ||c=='*' || c=='(' ||c==')' ||c=='-' ||
            c=='+')
            special=true;
        }
        if(uppercase==false || lowercase==false || special==false ||
        digit==false)
        return false;

        for(int i=1; i<password.length(); i++)
        {
            if(password.charAt(i)==password.charAt(i-1))
            return false;
        }
        return true;
    }
}
