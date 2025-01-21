package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

import java.sql.SQLOutput;

public class TodoListServiceTest {
    public static void main(String[] args) {
    testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();

        todoListRepository.data[0] = new TodoList("Belajar Java OOP");
        todoListRepository.data[1] = new TodoList("Aplikasi Java Dasar");
        todoListRepository.data[2] = new TodoList("Belajar Java Collection");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();

    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListServiceImpl todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");
        System.out.println();
        todoListService.showTodoList();
        System.out.println();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        System.out.println();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        System.out.println();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }
}
