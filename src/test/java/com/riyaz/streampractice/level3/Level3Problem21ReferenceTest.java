package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem21Reference;

class Level3Problem21ReferenceTest {


    @Test
    void shouldRemoveDuplicatesPreservingOrder() {
        assertEquals(List.of(1, 2, 3), Problem21Reference.solve(List.of(1, 2, 2, 3, 1)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem21Reference.solve(List.of()));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem21Reference.solve(null));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(List.of(9), Problem21Reference.solve(List.of(9)));
    }

    @Test
    void shouldHandleAllDuplicates() {
        assertEquals(List.of(5), Problem21Reference.solve(List.of(5, 5, 5)));
    }

}
