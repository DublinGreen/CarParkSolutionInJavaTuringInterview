package com.cliquedom.turing.interfaces;

import com.cliquedom.turing.park.SlotKeyGenerator;
import java.util.Set;

/**
 *
 * @author green
 */
public interface SlotKeyGeneratorImpl {

    public int generate();

    public int getSlotKeyLimit();

    public SlotKeyGenerator buildSlotKeyGenerator(int limit);

    public boolean checkSize();

    public void add(int value);

    public void remove(int value);
    
    public Set getGeneratedSet();

}
