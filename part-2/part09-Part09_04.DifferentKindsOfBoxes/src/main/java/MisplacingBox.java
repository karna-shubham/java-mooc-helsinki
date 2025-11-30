/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.ArrayList;

public class MisplacingBox extends Box {

    public MisplacingBox() {
        // nothing needed
    }

    @Override
    public void add(Item item) {
        // Accept the item, but "lose" it (do nothing)
    }

    @Override
    public boolean isInBox(Item item) {
        return false;    // items can never be found
    }
}

