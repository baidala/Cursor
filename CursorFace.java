public interface CursorFase {
    public void createItem(String[] value);
    public void printCursor();
    public void printItemCursor(int pos);
    public void moveToFirst();
    public void moveToNext();
    public void moveToPosition(int pos);
    public HashMap<String, String> getItem(int pos);
    public void updatePosition(int pos, String[] values);
    public void deletePosition(int pos);
    public void clearAll();
    public void sortCursor(int type);
    public int getSize(); 
    public void insert(int pos, String[] values);
    public boolean isLast();
    
    
}
