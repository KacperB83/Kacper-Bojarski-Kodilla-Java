package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Tests for statistics")
public class StatisticsTestSuite {
    private static int testCounter = 0;
    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    /*@Test
    void testCalculateAdvStatisticsWith0Posts() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(0);

        // When
          statisticsCalculation.calculateAdvStatistics(statistics);
          statisticsCalculation.showStatistics();

        // Then
        assertEquals(0, statisticsCalculation.getNumberOfPosts());
    }*/

    @Test
    void testCalculateAdvStatisticsWith1000Posts() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(1000);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(1000, statisticsCalculation.getNumberOfPosts());
    }

    /*@Test
    void testCalculateAdvStatisticsWith0Comments() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.commentsCount()).thenReturn(0);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(0, statisticsCalculation.getNumberOfComments());
    }*/

    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThenPosts() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(10);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(50, statisticsCalculation.getNumberOfPosts());
        assertEquals(10, statisticsCalculation.getNumberOfComments());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThenPosts() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(100);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(20, statisticsCalculation.getNumberOfPosts());
        assertEquals(100, statisticsCalculation.getNumberOfComments());
    }
   /* @Test
    void testCalculateAdvStatisticsWhenNoUser() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();

        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(10);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(50, statisticsCalculation.getNumberOfPosts());
        assertEquals(10, statisticsCalculation.getNumberOfComments());
    }*/

    @Test
    void testCalculateAdvStatisticsWith100Users() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        for(int n = 0; n<100; n++){
            listOfUsers.add(""+n);
        }
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(500);
        when(statistics.commentsCount()).thenReturn(1000);

        // When
        statisticsCalculation.calculateAdvStatistics(statistics);
        statisticsCalculation.showStatistics();

        // Then
        assertEquals(100, statisticsCalculation.getNumberOfUsers());
        assertEquals(500, statisticsCalculation.getNumberOfPosts());
        assertEquals(1000, statisticsCalculation.getNumberOfComments());
    }
}
