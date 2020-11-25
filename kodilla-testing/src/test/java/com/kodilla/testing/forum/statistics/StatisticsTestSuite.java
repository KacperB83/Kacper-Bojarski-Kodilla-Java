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

    @Test
    void testCalculateAdvStatistics() {
        // Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics statisticsCalculation = new CalculateStatistics(statistics);
        List<String> listOfUsers = statistics.usersNames();
        listOfUsers.add("user1");
        listOfUsers.add("user2");
        listOfUsers.add("user3");
        listOfUsers.add("user4");

        when(statistics.postsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
          statisticsCalculation.calculateAdvStatistics(statistics);
          statisticsCalculation.showStatistics();

        // Then
        assertEquals(0, statisticsCalculation);

    }
}
