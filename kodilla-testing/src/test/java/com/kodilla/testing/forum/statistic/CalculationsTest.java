package com.kodilla.testing.forum.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculationsTest {
    @Test
    public void calcAdvStatistics(){
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Bartosz Jurga");
        userList.add("Milosz Masny");
        userList.add("Jacek Gralak");

        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.userNames()).thenReturn(userList);

        Calculations calculations = new Calculations(statistics);

        //When
        int resultComments = calculations.calcComments();
        int resultPost = calculations.calcPosts();
        int resultUsers = calculations.calcUsers();

        //Then
        Assertions.assertEquals(100, resultComments);
        Assertions.assertEquals(1000, resultPost);
        Assertions.assertEquals(3, resultUsers);

    }

}