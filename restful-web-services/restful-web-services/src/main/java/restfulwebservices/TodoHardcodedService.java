package restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TodoHardcodedService {
       private static List<Todo> todos = new ArrayList<Todo>();
       private static int idCounter = 0;
       
       static {
    	   todos.add(new Todo(++idCounter,"in28Minutes","Learn to dance",new Date(),false));
    	   todos.add(new Todo(++idCounter,"in28Minutes","Learn code with durgesh",new Date(),false));
    	   todos.add(new Todo(++idCounter,"in28Minutes","Learn to code with Harry",new Date(),false));

       }
       
       public List<Todo> findAll(){
		return todos;
    	   
       }
       public Todo save(Todo todo) {
    	   if(todo.getId()==-1|| todo.getId()==0) {
    		   todo.setId(++idCounter);
    		   todos.add(todo);
    	   }
    	   else {
    		   deleteById(todo.getId());
    		   todos.add(todo);
    	   }
    	   return todo;
       }
       public Todo deleteById(long id) {
    	   Todo todo = findById(id);
    	   if(todo==null) return null;
    	   todos.remove(todo);
    	   
    	   return todo;
       }
	 Todo findById(long id) {
		// TODO Auto-generated method stub
		for(Todo t:todos) {
			if(t.getId()==id) {
				return t;
			}
		}
		return null;
	}
      
       
}
