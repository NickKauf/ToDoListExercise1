package com.example.todolistwpic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

    public static long idCounter = 0;
    ArrayList<ToDoItem> toDoItems = new ArrayList<>();


    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/add")
    public String enterItem(Model model){
        model.addAttribute("newItem", new ToDoItem());
        return "todoform";
    }

    @PostMapping("/add")
    public String loadFromForm(@ModelAttribute ToDoItem newItem, BindingResult result, Model model) {
        toDoItems.add(newItem);
        model.addAttribute("toDoItems", toDoItems);
        return "todolist";
    }

    @RequestMapping("/list")
    public String listAll(@ModelAttribute ToDoItem newItem,Model model){
        model.addAttribute("toDoItems", toDoItems);
        return "todolist";
    }

}
