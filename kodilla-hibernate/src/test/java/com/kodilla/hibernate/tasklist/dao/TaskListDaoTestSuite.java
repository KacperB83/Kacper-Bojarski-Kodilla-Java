package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
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
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> readList = taskListDao.findByListName(name);
        //Then
        assertEquals("List toDo", readList.get(0).getListName());
        assertEquals(1, readList.size());
        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
