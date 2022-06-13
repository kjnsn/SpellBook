package com.github.kjnsn.spellbook.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpellTest {
    @Test
    public void testSpellCreation() {
        Spell spell = Spell.create("fireball");
        assertEquals("fireball", spell.name());
    }
}
