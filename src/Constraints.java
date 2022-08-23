public class Constraints {

    public boolean testingLength(String name){
        String n = name;
        if (n.length() >=1 & n.length() <=15) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isStringLowerCase(String name){

        //convert String to char array
        char[] charArray = name.toCharArray();
        for(int i=0; i < charArray.length; i++){
            //if the character is a letter
            if( Character.isLetter(charArray[i]) ){
                //if any character is not in lower case, return false
                if( !Character.isLowerCase( charArray[i] ))
                    return false;
            }
        }
        return true;

    }

}
