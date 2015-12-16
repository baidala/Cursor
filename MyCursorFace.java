/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.itstep.android11.baidala;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author student
 */
public class MyCursorFace extends ArrayList<HashMap<String, String>> implements CursorFase  {
    private String[] cursorKeys;
    private int position;
    
    MyCursorFace (String[] values) {
        super();
        this.cursorKeys = values;
        this.position = 0;
    }

    @Override
    public void createItem(String[] values) {
        HashMap<String, String> localMap = new HashMap<String, String>();
        
        for (int i = 0; i < cursorKeys.length; i++) {
            localMap.put(cursorKeys[i], values[i]);
        }
        
        this.add(localMap);
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void printCursor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printItemCursor(int pos) {
        HashMap<String, String> local = new HashMap<String, String>();
        try {
            local = this.getItem(pos);
            for (int i = 0; i < cursorKeys.length ; i++) {
                System.out.println( cursorKeys[i] +":"+ local.get(cursorKeys[i]));
                
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No such position."); 
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveToFirst() {
        this.position = 0;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveToNext() {
        this.position++;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveToPosition(int pos) {
        
        this.position = pos;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, String> getItem(int pos) {
        return this.get(pos);
        
        
    }
    private HashMap<String, String>  createHashItem(String[] values) {
        HashMap<String, String> localMap = new HashMap<String, String>();
        
        for (int i = 0; i < cursorKeys.length; i++) {
            localMap.put(cursorKeys[i], values[i]);
        }
        return localMap;
    }

    @Override
    public void updatePosition(int pos, String[] values) {
        this.deletePosition(pos);
        this.insert(pos, values);
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePosition(int pos) {
        this.remove(pos);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clearAll() {
        this.removeAll(this);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortCursor(int type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return this.size();
        
        
    }

    @Override
    public void insert(int pos, String[] values) {
        
        try {
            this.add(pos, this.createHashItem(values));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No such position.");
        };
        
    }

    @Override
    public boolean isLast() {
        return (position == this.size() - 1);
        
        
    }
}
