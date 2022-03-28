package com.github.pareronia.topcoder.rookiesrm._10.div1.b;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EllysPronunciationTest {
    
    private EllysPronunciation ellysPronunciation;
    
    @BeforeEach
    void setUp() {
        ellysPronunciation = new EllysPronunciation();
    }

    @Test
    void test0() {
        assertThat(ellysPronunciation.getGood(new String[] {
            "wrath", "allure", "vorliebe", "abneigung", "amor", "voulez", "ecoeurement", "odiar"
        }), is(4));
    }

    @Test
    void test1() {
        assertThat(ellysPronunciation.getGood(new String[] {
            "schornsteinfeger", "schmetterling", "lohnsteuerabzugsbescheinigung", "shifffahrt",
            "deutsch", "ist", "die", "schoenste", "sprache", "auf", "der", "welt"
        }), is(0));
    }

    @Test
    void test2() {
        assertThat(ellysPronunciation.getGood(new String[] {
            "hearing", "vision", "smell", "touch", "taste",
            "denial", "anger", "bargaining", "depression", "acceptance",
            "war", "famine", "plague", "death",
            "pog", "story", "sarah", "gender", "baleen",
            "posh", "sporty", "scary", "ginger", "baby", "spice"
        }), is(5));
    }

    @Test
    void test3() {
        assertThat(ellysPronunciation.getGood(new String[] {
            "this", "was", "a", "triumph",
            "i", "am", "making", "a", "note", "here", "huge", "success",
            "its", "hard", "to", "overstate", "my", "satisfaction"
        }), is(5));
    }

    @Test
    void test4() {
        assertThat(ellysPronunciation.getGood(new String[] {
            "wir", "werden", "alle", "sterben", "haltet", "euch", "bereit",
            "die", "zeichen", "sind", "eindeutig", "bald", "ist", "es", "soweit",
            "vielleicht", "schon", "heute", "abend", "vielleicht", "in", "einem", "jahr",
            "doch", "alle", "verden", "sterben", "traurig", "aber", "wahr"
        }), is(8));
    }
}
