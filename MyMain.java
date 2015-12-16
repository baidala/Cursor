public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] keys = {"id","name", "job", "age", "sex", "salary"};
        String[] value = {}
        
        MyCursorFace myCursor = new MyCursorFace(keys);
        
        
        
        myCursor.createItem();
        
    }
    }
