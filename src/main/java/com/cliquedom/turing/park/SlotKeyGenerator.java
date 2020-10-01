package com.cliquedom.turing.park;

import com.cliquedom.turing.interfaces.SlotKeyGeneratorImpl;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author green builds a new SlotKeyGenerator
 */
public class SlotKeyGenerator implements SlotKeyGeneratorImpl {

    private final SlotKeyGenerator slotKeyGenerator = null;
    private final SecureRandom random = new SecureRandom();
    private final Set<Integer> generatedSet = new HashSet<>();
    private int limit = 0;

    @Override
    public int generate() {
        int intRandom = random.nextInt(this.limit);
        if (this.checkSize() && intRandom != 0) {
            return intRandom;
        }else{
            return 0; // meaning exceeded limit
        }
    }

    @Override
    public boolean checkSize() {
        if (generatedSet.size() < this.limit) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void add(int value) {
        if (!generatedSet.contains(value)) {
            generatedSet.add(value);
        }
    }

    @Override
    public void remove(int value) {
        if (generatedSet.contains(value)) {
            generatedSet.remove(value);
        }
    }

    @Override
    public Set getGeneratedSet() {
        return this.generatedSet;
    }

    @Override
    public int getSlotKeyLimit() {
        return this.limit;
    }

    @Override
    public SlotKeyGenerator buildSlotKeyGenerator(int limit) {
        this.limit = limit;
        return this.slotKeyGenerator;
    }

}
