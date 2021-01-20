package CompositePattern;

import java.util.List;

public class Project implements ToDoList {
    String title;
    List<ToDoList> todos;

    public Project(String title, List<ToDoList> todos) {
        this.title = title;
        this.todos = todos;
    }

    @Override
    public String getHTML() {
        String html = "<h1>";
        html+= this.title;
        html+= "</h1><ul>";
        for (ToDoList list : this.todos){
            html += "<li>";
            html += list.getHTML();
            html += "</li>";
        }
        html += "</ul>";
        return html;
    }
}
