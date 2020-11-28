package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum () {
        userList.add(new ForumUser(1, "Jan", 'M', 1987, 2, 11, 1));
        userList.add(new ForumUser(2, "Maniek", 'M', 1999, 10, 11, 5));
        userList.add(new ForumUser(3, "Olka", 'F', 2001, 4, 5, 1));
        userList.add(new ForumUser(4, "Madzia", 'F', 1989, 2, 7, 0));
        userList.add(new ForumUser(5, "Dyzio", 'M', 2000, 3, 24, 3));
        userList.add(new ForumUser(6, "Tosiek", 'M', 2017, 11, 7, 6));
        userList.add(new ForumUser(7, "Ulcia", 'F', 2008, 6, 3, 8));
        userList.add(new ForumUser(8, "Frania", 'F', 1947, 12, 24, 3));
        userList.add(new ForumUser(9, "Julka", 'F', 2015, 5, 25, 1));
        userList.add(new ForumUser(10, "Wiktorio", 'M', 2012, 8, 20, 2));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}
