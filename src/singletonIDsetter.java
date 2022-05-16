public class singletonIDsetter {
    private static int idNum = 1;

    private singletonIDsetter(){
        //Singleton class now that constructor is private
    }

    public static int setID(){
        return idNum++;
    }

    public static int getNumOfEntries(){
        return idNum-1;
    }
}
