package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements  TodoListService{
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] data = todoListRepository.getAll();
        System.out.println("TODOLIST");
        for(var i=0;i<data.length;i++){

            var todoList = data[i];
            var no = i + 1;

            if(todoList != null){
                System.out.println(no + ". "+ todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todolist = new TodoList(todo);
        todoListRepository.add(todolist);
        System.out.println("SUKSES MENAMBAH TODO : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
     boolean success = todoListRepository.remove(number);

     if(success){
         System.out.println("BERHASIL MENGHAPUS TODO NOMOR "+number);
     }else{
         System.out.println("GAGAL MENGHAPUS TODO NOMOR "+number);
     }
    }
}
