package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName ("Forum test suite")
class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test case: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test case: end");
    }
    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }
    @DisplayName ("When created SimpleUser with name, " +
            "then getUsername should return correct name"
    )
    @Test
    void testCaseUsername () {
        //given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //when
        String result = simpleUser.getUsername();
        String expectedResult = "theForumUser";
        //then
        Assertions.assertEquals(expectedResult, result);
    }
}
