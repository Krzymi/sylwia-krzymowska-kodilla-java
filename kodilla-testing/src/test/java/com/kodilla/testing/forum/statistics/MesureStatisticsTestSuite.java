package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MesureStatisticsTestSuite {

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> userList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String user = "User" + n;
            userList.add(user);
        }
        return userList;
    }

    @Mock
    private Statistics statisticsMock;
    @Mock
    private Statistics statisticsMock2;
    @Mock
    private Statistics statisticsMock3;
    @Mock
    private Statistics statisticsMock4;
    @Mock
    private Statistics statisticsMock5;

    @Before
    public void prepareCases(){

        List<String> noUsers = generateListOfUsers(0);
        List<String> UsersOf100 = generateListOfUsers(100);
        int postsOf0 = 0;
        int postsOf1000 = 1000;
        int commetsOf0 = 0;
        int commetsLessThanPostsButNot0 = 800;
        int commetsMoreThanPosts = 1200;

        //First Mock Tests;
        when(statisticsMock.usersNames()).thenReturn(noUsers);
        when(statisticsMock.postsCount()).thenReturn(postsOf0);
        when(statisticsMock.commentsCount()).thenReturn(commetsOf0);

        //Second Mock Tests;
        when(statisticsMock2.usersNames()).thenReturn(UsersOf100);
        when(statisticsMock2.postsCount()).thenReturn(postsOf0);
        when(statisticsMock2.commentsCount()).thenReturn(commetsOf0);

        //Third Mock Tests;
        when(statisticsMock3.usersNames()).thenReturn(UsersOf100);
        when(statisticsMock3.postsCount()).thenReturn(postsOf1000);
        when(statisticsMock3.commentsCount()).thenReturn(commetsOf0);

        //4th Mock Tests;
        when(statisticsMock4.usersNames()).thenReturn(UsersOf100);
        when(statisticsMock4.postsCount()).thenReturn(postsOf1000);
        when(statisticsMock4.commentsCount()).thenReturn(commetsLessThanPostsButNot0);

        //5th Mock Tests;
        when(statisticsMock5.usersNames()).thenReturn(UsersOf100);
        when(statisticsMock5.postsCount()).thenReturn(postsOf1000);
        when(statisticsMock5.commentsCount()).thenReturn(commetsMoreThanPosts);
    }

    @Test
    void testCalculateAdvStatisticPostsPerUserAvg() {
        // Given
        MesureStatistics mesureStatistics1 = new MesureStatistics();
        MesureStatistics mesureStatistics2 = new MesureStatistics();
        MesureStatistics mesureStatistics3 = new MesureStatistics();
        MesureStatistics mesureStatistics4 = new MesureStatistics();
        MesureStatistics mesureStatistics5 = new MesureStatistics();
        // When
        mesureStatistics1.calculateAdvStatistics(statisticsMock);
        mesureStatistics2.calculateAdvStatistics(statisticsMock2);
        mesureStatistics3.calculateAdvStatistics(statisticsMock3);
        mesureStatistics4.calculateAdvStatistics(statisticsMock4);
        mesureStatistics5.calculateAdvStatistics(statisticsMock5);
        // Then
        assertEquals(0, mesureStatistics1.getPostsPerUserAvg());
        assertEquals(0, mesureStatistics2.getPostsPerUserAvg());
        assertEquals(10, mesureStatistics3.getPostsPerUserAvg());
        assertEquals(10, mesureStatistics4.getPostsPerUserAvg());
        assertEquals(10, mesureStatistics5.getPostsPerUserAvg());
    }
}
