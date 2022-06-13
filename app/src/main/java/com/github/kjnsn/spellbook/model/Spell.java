package com.github.kjnsn.spellbook.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Spell {
    static Spell create(String name) {
        return new AutoValue_Spell(name);
    }

    abstract String name();
}
