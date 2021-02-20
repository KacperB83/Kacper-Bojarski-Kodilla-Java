package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String LISTNAME = "List toDo";
    private static final String DESCRIPTION = "Those are tasks we still have to do.";

    @Autowired
    private TaskListDao1 taskListDao1;

    @Test
    void testFindByListName() {
        //Given
        TaskList1 taskList = new TaskList1(LISTNAME, DESCRIPTION);
        taskListDao1.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList1> readList = taskListDao1.findByListName(name);
        //Then
        assertEquals("List toDo", readList.get(0).getListName());
        assertEquals(1, readList.size());
        //CleanUp
        int id = readList.get(0).getId();
        taskListDao1.deleteById(id);
    }
}
